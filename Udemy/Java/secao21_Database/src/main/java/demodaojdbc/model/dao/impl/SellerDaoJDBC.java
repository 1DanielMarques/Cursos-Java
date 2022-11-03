package demodaojdbc.model.dao.impl;

import demodaojdbc.DbException;
import demodaojdbc.db.DB;
import demodaojdbc.model.dao.SellerDao;
import demodaojdbc.model.entities.Department;
import demodaojdbc.model.entities.Seller;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SellerDaoJDBC implements SellerDao {

    private Connection con;


    public SellerDaoJDBC(Connection con) {
        this.con = con;
    }

    @Override
    public void insert(Seller seller) {
        PreparedStatement st = null;
        try {
            st = con.prepareStatement(
                    " INSERT INTO seller " +
                            " (Name,Email,BirthDate,BaseSalary,DepartmentId) " +
                            " VALUES " +
                            " (?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            st.setString(1, seller.getName());
            st.setString(2, seller.getEmail());
            st.setDate(3, new Date(seller.getBirthDate().getTime()));
            st.setDouble(4, seller.getBaseSalary());
            st.setInt(5, seller.getDepartment().getId());

            int rowsAffected = st.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    seller.setId(id);
                }
                DB.closeResultSet(rs);
            } else {
                throw new DbException("Unexpected error! No rows affected!");
            }
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);

        }
    }

    @Override
    public void update(Seller seller) {
        PreparedStatement st = null;
        try {
            st = con.prepareStatement(
                    " UPDATE seller " +
                            " SET Name = ?, Email = ?, BirthDate = ?, " +
                            " BaseSalary = ?, DepartmentId = ? " +
                            " WHERE Id = ?");
            st.setString(1, seller.getName());
            st.setString(2, seller.getEmail());
            st.setDate(3, new Date(seller.getBirthDate().getTime()));
            st.setDouble(4, seller.getBaseSalary());
            st.setInt(5, seller.getDepartment().getId());
            st.setInt(6, seller.getId());
            st.executeUpdate();

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
        }
    }

    @Override
    public void deleteById(Integer id) {
        PreparedStatement st = null;
        try {
            st = con.prepareStatement("DELETE FROM SELLER WHERE Id = ?");
            st.setInt(1, id);
            int rows = st.executeUpdate();
            if (rows == 0) {
                throw new DbException("There isn't a seller with the id " + id);
            }
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
        }
    }

    @Override
    public Seller findById(Integer id) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = con.prepareStatement(
                    " SELECT seller.*, department.Name as DepName " +
                            " FROM seller INNER JOIN department ON " +
                            " seller.DepartmentId = department.Id " +
                            " WHERE seller.Id = ? "
            );
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                Department dep = instantiateDepartment(rs);
                Seller seller = instantiateSeller(rs, dep);
                return seller;
            }
            return null;

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(ps);
            DB.closeResultSet(rs);
        }
    }

    private Seller instantiateSeller(ResultSet rs, Department dep) throws SQLException {
        Seller seller = new Seller(rs.getString("Name"), rs.getString("Email"), rs.getDate("BirthDate"), rs.getDouble("BaseSalary"), dep);
        seller.setId(rs.getInt("Id"));
        return seller;
    }

    private Department instantiateDepartment(ResultSet rs) throws SQLException {
        Department dep = new Department(rs.getInt("DepartmentId"), rs.getString("DepName"));
        return dep;
    }

    @Override
    public List<Seller> findAll() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = con.prepareStatement(
                    " SELECT seller.*, department.Name as DepName " +
                            " FROM seller INNER JOIN department ON " +
                            " seller.DepartmentId = department.Id " +
                            " ORDER BY Name");
            rs = ps.executeQuery();
            List<Seller> list = new ArrayList<>();
            Map<Integer, Department> map = new HashMap<>();

            while (rs.next()) {

                Department dep = map.get(rs.getInt("DepartmentId"));
                if (dep == null) {
                    dep = instantiateDepartment(rs);
                    map.put(rs.getInt("DepartmentId"), dep);
                }

                list.add(instantiateSeller(rs, dep));
            }
            return list;

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(ps);
            DB.closeResultSet(rs);
        }
    }

    @Override
    public List<Seller> findByDepartment(Department department) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = con.prepareStatement(
                    " SELECT seller.*, department.Name as DepName " +
                            " FROM seller INNER JOIN department ON " +
                            " seller.DepartmentId = department.Id " +
                            " WHERE DepartmentId = ? ORDER BY Name");
            ps.setInt(1, department.getId());
            rs = ps.executeQuery();
            List<Seller> list = new ArrayList<>();
            Map<Integer, Department> map = new HashMap<>();

            while (rs.next()) {

                Department dep = map.get(rs.getInt("DepartmentId"));
                if (dep == null) {
                    dep = instantiateDepartment(rs);
                    map.put(rs.getInt("DepartmentId"), dep);
                }

                list.add(instantiateSeller(rs, dep));
            }
            return list;

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(ps);
            DB.closeResultSet(rs);
        }
    }


}

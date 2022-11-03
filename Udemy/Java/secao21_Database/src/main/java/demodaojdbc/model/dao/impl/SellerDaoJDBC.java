package demodaojdbc.model.dao.impl;

import demodaojdbc.DbException;
import demodaojdbc.db.DB;
import demodaojdbc.model.dao.SellerDao;
import demodaojdbc.model.entities.Department;
import demodaojdbc.model.entities.Seller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class SellerDaoJDBC implements SellerDao {

    private Connection con;


    public SellerDaoJDBC(Connection con) {
        this.con = con;
    }

    @Override
    public void insert(Seller seller) {

    }

    @Override
    public void update(Seller seller) {

    }

    @Override
    public void deleteById(Integer id) {

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
                Seller seller = new Seller(rs.getInt("Id"), rs.getString("Name"), rs.getString("Email"), rs.getDate("BirthDate"), rs.getDouble("BaseSalary"), new Department(rs.getInt("DepartmentId"), rs.getString("DepName")));
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

    @Override
    public List<Seller> findAll() {
        return null;
    }
}

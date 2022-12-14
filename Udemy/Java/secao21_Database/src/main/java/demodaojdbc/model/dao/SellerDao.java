package demodaojdbc.model.dao;

import demodaojdbc.model.entities.Department;
import demodaojdbc.model.entities.Seller;

import java.util.List;

public interface SellerDao {

    void insert(Seller seller);

    void update(Seller seller);

    void deleteById(Integer id);

    Seller findById(Integer id);

    List<Seller> findAll();
    List<Seller> findByDepartment(Department department);

}

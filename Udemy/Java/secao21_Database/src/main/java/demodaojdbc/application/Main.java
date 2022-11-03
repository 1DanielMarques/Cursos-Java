package demodaojdbc.application;

import demodaojdbc.model.dao.DaoFactory;
import demodaojdbc.model.dao.SellerDao;
import demodaojdbc.model.entities.Department;
import demodaojdbc.model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("--- Test 1: seller findById---");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n--- Test 2: seller findByDepartment---");
        List<Seller> list = sellerDao.findByDepartment(new Department(2, null));
        for (Seller s : list) {
            System.out.println(s);
        }

        System.out.println("\n--- Test 3: seller findAll---");
        list = sellerDao.findAll();
        for (Seller s : list) {
            System.out.println(s);
        }

        System.out.println("\n--- Test 4: seller insert---");
        Seller seller1 = new Seller("Greg", "greg@gmail.com", new Date(), 4000.0, new Department(2, null));
        sellerDao.insert(seller1);
        list = sellerDao.findAll();
        for (Seller s : list) {
            System.out.println(s);
        }

    }
}

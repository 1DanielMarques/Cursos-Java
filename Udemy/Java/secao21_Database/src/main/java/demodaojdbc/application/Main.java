package demodaojdbc.application;

import demodaojdbc.model.dao.DaoFactory;
import demodaojdbc.model.dao.SellerDao;
import demodaojdbc.model.entities.Seller;

public class Main {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);



    }
}

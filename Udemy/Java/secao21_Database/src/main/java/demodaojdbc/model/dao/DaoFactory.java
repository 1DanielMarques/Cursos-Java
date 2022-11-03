package demodaojdbc.model.dao;

import demodaojdbc.model.dao.impl.SellerDaoJDBC;
import jdbc1.db.DB;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }

}

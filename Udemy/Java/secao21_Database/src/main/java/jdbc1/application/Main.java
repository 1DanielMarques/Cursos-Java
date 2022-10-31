package jdbc1.application;

import jdbc1.db.DB;
import jdbc1.db.DbIntegrityException;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {

        Connection con = null;
        PreparedStatement st = null;
        try {
            con = DB.getConnection();
            st = con.prepareStatement(
                    " DELETE FROM department " +
                            " WHERE " +
                            " Id = ? ");

            st.setInt(1, 2);
            st.execute();
        } catch (SQLException e) {
            throw new DbIntegrityException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeConnection(con);
        }

    }
}

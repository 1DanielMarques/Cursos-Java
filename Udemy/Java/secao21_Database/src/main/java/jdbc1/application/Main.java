package jdbc1.application;

import jdbc1.db.DB;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {

        Connection con = null;
        PreparedStatement st = null;
        try {
            con = DB.getConnection();

            st.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.closeStatement(st);
            DB.closeConnection(con);
        }

    }
}

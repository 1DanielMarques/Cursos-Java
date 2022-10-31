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
            st = con.prepareStatement(
                    " UPDATE seller " +
                            " SET BaseSalary =  BaseSalary + ? " +
                            " WHERE " +
                            " (DepartmentId = ?)");
            st.setDouble(1, 200.0);
            st.setInt(2, 2);
            //int rowsAffected = st.executeUpdate();
            //System.out.printf("Rows Affected: " + rowsAffected);
            st.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.closeStatement(st);
            DB.closeConnection(con);
        }

    }
}

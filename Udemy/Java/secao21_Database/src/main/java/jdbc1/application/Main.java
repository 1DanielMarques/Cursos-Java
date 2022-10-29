package jdbc1.application;

import jdbc1.db.DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;
        try {
            con = DB.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery("SELECT * FROM department");
            while (rs.next()) {
                System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.closeStatement(stm);



        }
    }
}

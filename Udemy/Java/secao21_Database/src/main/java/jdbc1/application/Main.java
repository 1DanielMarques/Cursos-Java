package jdbc1.application;

import demodaojdbc.db.DB;
import jdbc1.db.DbException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        Connection con = null;
        Statement st = null;
        try {
            con = DB.getConnection();

            con.setAutoCommit(false);

            st = con.createStatement();

            int rows1 = st.executeUpdate(" UPDATE seller SET BaseSalary = 2090.0 WHERE DepartMentId = 1 ");

           /* int x = 1;
            if (x < 2) {
                throw new SQLException("Fake error!");
            }*/

            int rows2 = st.executeUpdate(" UPDATE seller SET BaseSalary = 3090.0 WHERE DepartMentId = 2 ");

            con.commit();
            System.out.println("rows1: " + rows1);
            System.out.println("rows2: " + rows2);


        } catch (SQLException e) {
            try {
                con.rollback();
                throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());
            } catch (SQLException ex) {
                throw new DbException("Error trying to rollback! Caused by: " + ex.getMessage());
            }
        } finally {
            DB.closeStatement(st);
            DB.closeConnection(con);
        }

    }
}


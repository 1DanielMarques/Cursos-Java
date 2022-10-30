package jdbc1.application;

import jdbc1.db.DB;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Connection con = null;
        PreparedStatement pstm = null;
        try {
            con = DB.getConnection();
            pstm = con.prepareStatement(
                    "INSERT INTO seller " +
                            " (Name, Email, BirthDate, BaseSalary, DepartmentId) " +
                            " VALUES " +
                            " (?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            pstm.setString(1, "Daniel Marques");
            pstm.setString(2, "daniel@gmail.com");
            pstm.setDate(3, new Date(sdf.parse("09/09/2003").getTime()));
            pstm.setDouble(4, 3000.0);
            pstm.setInt(5, 4);
            //pstm.execute();
            int rowsAffected = pstm.executeUpdate();
            if (rowsAffected > 0) {
                ResultSet rs = pstm.getGeneratedKeys();
                while (rs.next()) {
                    int id = rs.getInt(1);
                    System.out.println("Id = " + id);
                }

            } else {
                System.out.printf("No rows affected!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } finally {
            DB.closeStatement(pstm);
            DB.closeConnection(con);
        }

    }
}

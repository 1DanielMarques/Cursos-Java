package jdbc1.application;

import jdbc1.db.DB;
import jdbc1.db.DbException;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
                            " (?,?,?,?,?)");
            pstm.setString(1, "Daniel Marques");
            pstm.setString(2, "daniel@gmail.com");
            pstm.setDate(3, new Date(sdf.parse("09/09/2003").getTime()));
            pstm.setDouble(4, 3000.0);
            pstm.setInt(5, 4);

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } catch (ParseException e) {
            throw new DbException(e.getMessage());
        }


    }
}

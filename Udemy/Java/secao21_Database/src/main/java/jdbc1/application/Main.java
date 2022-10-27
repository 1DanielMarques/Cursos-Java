package jdbc1.application;

import jdbc1.db.DB;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connection con = DB.getConnection();
        DB.closeConnection();

    }
}

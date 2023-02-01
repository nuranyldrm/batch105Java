package ders52_Mysqlbaglama;




import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws IOException {
        Connection connection =null;
        DbHelper helper = new DbHelper();
        try {
            connection = helper.getConnection();
            System.out.println("Baglantı Olustu.");

        } catch (SQLException exception){
           helper.showErrorMessage(exception);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

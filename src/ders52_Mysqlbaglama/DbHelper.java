package ders52_Mysqlbaglama;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
    private String userName="root";
    private String pasword="127856";
    private String dburl="jdbc:mysql://localhost:3306/world?useSSL=false";
    public Connection getConnection() throws SQLException {

        return DriverManager.getConnection(dburl,userName, pasword);
    }
    public void showErrorMessage(SQLException exception){
        System.out.println("Error: " + exception.getMessage());
        System.out.println("Error code : "+ exception.getErrorCode());
    }

}

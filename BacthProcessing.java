package Ebookshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BacthProcessing {
    public static void main(String[] args) {
        try (
                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");
                Statement stmt = conn.createStatement();
                ){
            //
            conn.setAutoCommit(false); // turn off auto-commit for each SQL statement

            stmt.addBatch("Insert into books values(1008,'Java ABC','Kelvin John',1.1,9.9)");
            stmt.addBatch("Insert into books values(1009,'Java XYZ','Kelvin John',1.1,9.9)");
            stmt.addBatch("update books set price = 11.11 where id= 1008 or id = 1009");
            int[] returnCode =stmt.executeBatch();

            System.out.println("Return codes are: ");
            for(int code: returnCode){
                System.out.println(code + ", ");
            }
            System.out.println();
            conn.commit();

        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}

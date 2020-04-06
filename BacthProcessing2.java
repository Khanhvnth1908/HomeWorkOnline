package Ebookshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BacthProcessing2 {
    public static void main(String[] args) {
        try(
                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");

                PreparedStatement pstmt = conn.prepareStatement(
                        "Insert into books values(?,?,?,?,?)");
                ){
            conn.setAutoCommit(false);

            pstmt.setInt(1,1008);
            pstmt.setString(2,"Java 123 ");
            pstmt.setString(3,"Kelvin jone");
            pstmt.setDouble(4,12.34);
            pstmt.setInt(5,23);
            pstmt.addBatch();     // add the statments for batch processing

            pstmt.setInt(1,1009);
            pstmt.setString(2,"Java 456");
            //Khong thay doi bat cu gia tri nao tu cot 3->5
            pstmt.addBatch();

            int[] returnCode = pstmt.executeBatch();

            System.out.println("Return code are: ");
            for (int code : returnCode) System.out.printf(code + ", ");
            System.out.println();
            conn.commit();


        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}

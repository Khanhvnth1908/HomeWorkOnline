package Ebookstore.EbookstoreController;

import java.sql.*;
import java.util.Scanner;

public class CustomerCheckOut {
    Scanner sc = new Scanner(System.in);
    public void checkEmail(String email){
        try(
                Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");
                Statement stmt = conn.createStatement();
                ){
            String checkMail = "Select * from khach_hang where email = '" + email + "'";
            ResultSet rset = stmt.executeQuery(checkMail);
            if (rset.next()){
                System.out.println("\nXác nhận thành công! ");

                    System.out.println("------Bạn chọn phương thức thanh toán nào?-------\n"
                    + "1-COD\n"
                    + "2-VISA\n");

            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}

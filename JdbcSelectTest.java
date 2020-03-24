package Java2_04;


import java.sql.*;

public class JdbcSelectTest {
    public static void main(String[] args) {
        try(
                //step 1
                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");
                //step 2
                Statement stmt = conn.createStatement();
                ){
                //step 3
            String strselect = "select title,price,qty from books";
            System.out.println("The SQL statement is: " + strselect + "\n");
            ResultSet rset = stmt.executeQuery(strselect);
                //step 4
            System.out.println("The record selected are: ");
            int rowcount = 0;
            while (rset.next()){
                String title = rset.getString("title");
                double price = rset.getDouble("price");
                int qty = rset.getInt("qty");
                System.out.println(title + "," + price + "," + qty);
                rowcount++;
            }
            System.out.println("Total number record = " + rowcount);
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}

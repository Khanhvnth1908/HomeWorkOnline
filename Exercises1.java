package Java2_04;

import java.sql.*;

public class Exercises1 {
    public static void main(String[] args) {
        try (
                //step 1
                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");
                //step 2
                Statement statement = conn.createStatement();
        ) {
            //step 3
            //In ra tất cả các cột trong bảng

            String strselectall = "select * from books";
            System.out.println("The SQL statement is: " + strselectall + "\n");
            ResultSet rset = statement.executeQuery(strselectall);

            System.out.println("The record selected are: ");
            int rowcount = 0;
            while (rset.next()) {
                int id = rset.getInt("id");
                String author = rset.getString("author");
                String title = rset.getString("title");
                double price = rset.getDouble("price");
                int qty = rset.getInt("qty");
                System.out.println(id + ", " + author + ", " + title + ", " + price + ", " + qty);
                rowcount++;
            }
            System.out.println("Total number record = " + rowcount);
            System.out.println();

            //In ra title và price của người có tên 'Vuong Ngoc Khanh'
            String strselect = "select title,price from books where author='Vuong Ngoc Khanh' ";
            System.out.println("The SQL statement is: " + strselect);
            ResultSet rset2 = statement.executeQuery(strselect);

            System.out.println("The record selected are: ");
            int rowcount2 = 0;
            while (rset2.next()){
                String title = rset2.getString("title");
                double price = rset2.getDouble("price");
                System.out.println(title + ", " + price);
                rowcount2++;
            }
            System.out.println("Total number record = " + rowcount2);
            System.out.println();

            //In ra title,author,price,qty from books where author='Vuong Ngoc Khanh'
            // hoặc có giá >=30 với price sắp xếp theo chiều từ lớn đến bé và id từ lớn đến bé

            String strselect3 = "select title,author,price,qty from books where author='Vuong Ngoc Khanh' or price>=30 order by price DESC,id ASC";
            System.out.println("The SQL statement is: " + strselect3);
            ResultSet rset3 = statement.executeQuery(strselect3);

            System.out.println("The record select are: ");
            int rowcount3 = 0;
            while (rset3.next()){
                String title = rset3.getString("title");
                String author = rset3.getString("author");
                double price = rset3.getDouble("price");
                int qty = rset3.getInt("qty");
                rowcount3++;
                System.out.println(title + ", " + author + ", " + price + ", " + qty);
            }
            System.out.println("Total number record: " + rowcount3);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}

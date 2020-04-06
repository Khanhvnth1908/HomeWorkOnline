package Ebookstore.EbookstoreController;

import Ebookstore.EbookstoreModel.BookModel;
import Ebookstore.EbookstoreModel.CustomerModel;
import Ebookstore.EbookstoreModel.UserModel;
import java.sql.*;
public class Books {
    public void selectProducts(){
        try(
                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");
                Statement stmt = conn.createStatement();
        ){
            ResultSet rset = stmt.executeQuery("select * from sach");

            ResultSetMetaData rsetMD = rset.getMetaData();

            int numcolum =  rsetMD.getColumnCount();

            for (int i = 1; i <= numcolum; i++){          // In ra ten cua cot
                System.out.printf("%-45s", rsetMD.getColumnName(i));
            }
            System.out.println();

            for (int i = 1;i <= numcolum;i++){             // In ra kieu du lieu
                System.out.printf("%-45s",
                        "(" + rsetMD.getColumnClassName(i) + ")");
            }
            System.out.println();

            while (rset.next()){                             //Hien thi cac gia tri trong bang
                for (int i = 1; i <= numcolum ;i++){
                    System.out.printf("%-45s", rset.getString(i));
                }
                System.out.println();
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public void insertBooks(BookModel book){
        try(
                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");
                PreparedStatement pstmt = conn.prepareStatement(
                        "insert into sach(id,ten_sach,so_luong_sach,gia,the_loai_id,authour_id) values (?,?,?,?,?,?)");
        ){
            int id;
            id = book.getId();
            String name = book.getNameBook();
            int qty = book.getQty();
            double price = book.getPrice();
            int tl = book.getThe_loai_id();
            int authour = book.getAuthour_id();
            pstmt.setInt(1, id);
            pstmt.setString(2,name);
            pstmt.setInt(3,qty);
            pstmt.setDouble(4,price);
            pstmt.setInt(5,tl);
            pstmt.setInt(6,authour);
            int rowInsert = pstmt.executeUpdate();
            System.out.println(rowInsert + "row affected ");

        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public void deleteBooks(int id){
        try(
                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");
                PreparedStatement ptstmt = conn.prepareStatement(
                        "Delete from sach where id = ?");
                ){
            ptstmt.setInt(1, id);
            int rowDelete = ptstmt.executeUpdate();
            System.out.println(rowDelete + "row affected ");

        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public void updateBooks(BookModel book){
        try(
                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");
                PreparedStatement pstmt = conn.prepareStatement(
                        "update sach set so_luong_sach = ?, gia = ? where id = ?");
        ){
            int qty;
            qty = book.getQty();
            double price = book.getPrice();
            int id = book.getId();
            pstmt.setInt(1,qty);
            pstmt.setDouble(2,price);
            pstmt.setInt(3,id);
            int rowUpdate = pstmt.executeUpdate();
            System.out.println(rowUpdate + "row affected ");
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }


}

package Ebookstore.EbookstoreController;

import Ebookstore.EbookstoreModel.BookModel;
import Ebookstore.EbookstoreModel.CustomerModel;
import Ebookstore.EbookstoreModel.UserModel;
import java.util.List;
import java.util.ArrayList;
import java.sql.*;
import java.util.Scanner;
public class UserController {
        Scanner sc = new Scanner(System.in);
//    --------------------------------USER-------------------------------------------    //
    public void login(UserModel user){
        try(
                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");
                Statement sttm = conn.createStatement();
                ){
         String select = "select * from user where user_name= " + "'" + user.getUsername() + "'" + "and password = " + "'" + user.getPassword() + "'";
         ResultSet rset = sttm.executeQuery(select);
         if (rset.next()){
             System.out.println("========Success=============");
         }else{
             System.out.println("=========Doesn't Exits======");
         }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
    public void InsertUser(UserModel userModel){
        try(
                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");
                Statement stmt = conn.createStatement();
                ){
            String insert = "Insert into user(user_name,password) value (" + "'"  + userModel.getUsername()  + "'"
                    + ", '" + userModel.getPassword() + "')";
            int count = stmt.executeUpdate(insert);
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    //-------------------------------Books-------------------------//
    public void selectProducts(){
        try(
                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");
                Statement stmt = conn.createStatement();
        ){
            String selectAll = "Select * from sach";
            System.out.println("*Sau đây là thông tin các quyển sách có trong thư viện*: \n");
            ResultSet rset = stmt.executeQuery(selectAll);

            while (rset.next()){
                System.out.println(rset.getInt("id") + ", "
                        + rset.getString("ten_sach") + ", "
                        + rset.getInt("so_luong_sach") + ", "
                        + rset.getDouble("gia"));
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
                Statement stmt = conn.createStatement();
        ){
            String insertBooks = "Insert into sach(id,ten_sach,so_luong_sach,gia,the_loai_id,authour_id) value (" + book.getId()
                    + ", '" + book.getNameBook()
                    + "', " + book.getQty()
                    + ", " + book.getPrice() + ", " + book.getThe_loai_id()+ ", "  + book.getAuthour_id()+ ")";
            int count = stmt.executeUpdate(insertBooks);
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public void deleteBooks(int id){
        try(
                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");
                Statement stmt = conn.createStatement();
                ){
        String deleteBooks = "Delete from sach where id= " + id;
        int coun = stmt.executeUpdate(deleteBooks);
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public void updateBooks(BookModel book){
        try(
                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");
                Statement stmt = conn.createStatement();
        ){
            String updateBooks = "update sach set so_luong_sach=" + book.getQty()
                    + ", " + "gia= " + book.getPrice() + "where id= " + book.getId();
            int coun = stmt.executeUpdate(updateBooks);
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    //------------------Khách Hàng------------------//
    public void InsertCustomer(CustomerModel customer){
        try(
                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");
                Statement stmt = conn.createStatement();
                ){
            String InsertCutomer = "Insert into khach_hang values(" + customer.getId()
                    + ", '" + customer.getName()
                    + "', '" + customer.getEmail()
                    + "', '" + customer.getAddress()
                    + "', " + customer.getNumberPhone() + ")";
            int coun = stmt.executeUpdate(InsertCutomer);

        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public void updateCustomer(CustomerModel customer){
        try (
                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");
                Statement stmt = conn.createStatement();
                ){
            String updateCutomer = "update khach_hang set email= '" + customer.getEmail() + "' , sdt_kh='" + customer.getNumberPhone() + "'" + "where id= " + customer.getId();
            int count = stmt.executeUpdate(updateCutomer);
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public void deleteCustomer(int id){
        try(
                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");
                Statement stmt = conn.createStatement();
                ){
          String deleteCustomer = "Delete from khach_hang where id= " + id;
            int coun = stmt.executeUpdate(deleteCustomer);
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public void  selectCustomer(CustomerModel customer){
        try(
                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");
                Statement stmt = conn.createStatement();
        ){
            String selectCustomer = "select * from khach_hang";
            System.out.println("*Sau đây là danh sách thông tin khách hàng*: \n");
            ResultSet rset = stmt.executeQuery(selectCustomer);

            while (rset.next()){
                System.out.println(rset.getInt("id") + ", "
                        + rset.getString("ten_kh") + ", "
                        + rset.getString("email") + ", "
                        + rset.getString("dia_chi") + ", "
                        + rset.getString("sdt_kh"));
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}

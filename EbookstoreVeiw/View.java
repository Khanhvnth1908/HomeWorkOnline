package Ebookstore.EbookstoreVeiw;

import Ebookstore.EbookstoreController.UserController;
import Ebookstore.EbookstoreModel.BookModel;
import Ebookstore.EbookstoreModel.CustomerModel;
import Ebookstore.EbookstoreModel.UserModel;

import java.sql.*;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class View {
    public static void main(String[] args) {
        UserController userController = new UserController();
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            do {
                System.out.println();
                System.out.println("1-registration" + "\n"
                        + "2-Log in" + "\n");
                System.out.print("Enter n: ");
                n = sc.nextInt();
            } while (n > 2 || n < 0);
            switch (n) {
                case 1:
                    System.out.print("User name: ");
                    String userName = sc.nextLine();
                    userName = sc.nextLine();
                    System.out.print("Password: ");
                    String password = sc.nextLine();
                    UserModel m1 = new UserModel(userName, password);
                    userController.InsertUser(m1);
                    break;
                case 2:
                    int x = 0;
                    System.out.print("User name: ");
                    String userName2 = sc.nextLine();
                    userName2 = sc.nextLine();
                    System.out.print("Password: ");
                    String password2 = sc.nextLine();
                    UserModel m2 = new UserModel(userName2, password2);
                    userController.login(m2);
                    try(
                            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                                    "root",
                                    "");
                            Statement sttm = conn.createStatement();
                    ){
                        String select = "select * from user where user_name= " + "'" + m2.getUsername() + "'" + "and password = " + "'" + m2.getPassword() + "'";
                        ResultSet rset = sttm.executeQuery(select);
                        if (rset.next()){
                            int m;
                            do{
                                System.out.println("0-Thoát\n" +
                                        "1-Quản lý sản phẩm\n" +
                                        "2-Quản lý khách hàng\n");
                                 do {
                                     System.out.print("Nhập yêu cầu của bạn: ");
                                     m = sc.nextInt();
                                 }while (m<0 || m>2);
                                switch (m){
                                     case 1:
                                       do {
                                           System.out.println();
                                           System.out.println("=========Danh mục quản lí sản phẩm==========\n"
                                                   + "0-Thoát\n"
                                                   + "1-Thêm: id,name,price,qty,author\n"
                                                   + "2-Sửa: người dùng nhập id,chỉnh sửa thông tin gồm price và qty\n"
                                                   + "3-Xóa: Nhập id cuốn sách muốn xóa\n"
                                                   + "4-Hiển thị danh sách các cuốn sách");
                                           do {
                                               System.out.print("Nhập mục muốn chọn: ");
                                               x = sc.nextInt();
                                           }while (x <0 || x >5);
                                           switch (x){
                                               case 1:
                                                   System.out.print("Nhập Id: ");
                                                   int id = sc.nextInt();
                                                   System.out.print("Nhập tên sách: ");
                                                   String nameBook = sc.nextLine();
                                                   nameBook = sc.nextLine();
                                                   System.out.print("Nhập số lượng: ");
                                                   int qty = sc.nextInt();
                                                   System.out.print("Nhập giá: ");
                                                   double price = sc.nextDouble();
                                                   System.out.print("Id của thể loại: ");
                                                   int the_loai_id = sc.nextInt();
                                                   System.out.print("Nhập id author: ");
                                                   int athourID = sc.nextInt();
                                                   BookModel b2 = new BookModel(id,nameBook,qty,price,the_loai_id,athourID);
                                                   userController.insertBooks(b2);
                                                   break;
                                               case 2:
                                                   System.out.print("Nhập ID cuốn sách bạn muốn sửa: ");
                                                   int bookId = sc.nextInt();
                                                   System.out.print("Enter new QTY: ");
                                                   int newQty = sc.nextInt();
                                                   System.out.print("Enter new Price: ");
                                                    double newPrice = sc.nextDouble();
                                                    BookModel b3 = new BookModel(bookId,newQty,newPrice);
                                                    userController.updateBooks(b3);
                                                   break;
                                               case 3:
                                                   int a;
                                                   System.out.print("Nhập id cuốn sách muốn xóa: ");
                                                   a = sc.nextInt();
                                                   userController.deleteBooks(a);
                                                   break;
                                               case 4:
                                                   userController.selectProducts();
                                                   break;
                                           }
                                           if (x == 0){
                                               break;
                                           }
                                       }while (x!=0);
                                         break;
                                     case 2:
                                         do {
                                             System.out.println("===========Danh mục quản lý khách hàng===========\n"
                                                     + "0-Thoát\n"
                                                     + "1-Thêm: id,name,email,phone,address\n"
                                                     + "2-Sửa: Người dùng nhập id,chỉnh sửa email,phone\n"
                                                     + "3-Xóa: Nhập id người dùng muốn xóa\n"
                                                     + "4-Hiển thị danh sách khách hàng\n");
                                             do {
                                                 System.out.print("Nhập mục muốn chọn: ");
                                                 x = sc.nextInt();
                                             }while (x<0 || x>4);
                                             switch (x){
                                                 case 1:
                                                     System.out.print("Nhập Id: ");
                                                     int id = sc.nextInt();
                                                     System.out.print("Nhập tên khách hàng: ");
                                                     String name = sc.nextLine();
                                                     name = sc.nextLine();
                                                     System.out.print("Nhập Email khách hàng: ");
                                                     String email = sc.nextLine();
                                                     System.out.print("Nhập dịa chỉ khách hàng: ");
                                                     String address = sc.nextLine();
                                                     System.out.print("Nhập số điện thoại khách hàng: ");
                                                     String numberPhone = sc.next();
                                                     CustomerModel c1 = new CustomerModel(id,name,email,address,numberPhone);
                                                     userController.InsertCustomer(c1);
                                                     break;
                                                 case 2:
                                                     System.out.print("Nhập ID bạn muốn sửa: ");
                                                     int fixID = sc.nextInt();
                                                     System.out.print("Nhập email mới: ");
                                                     String fixEmail = sc.next();
                                                     System.out.print("Nhập số điện thoại mới: ");
                                                     String fixNumber = sc.next();
                                                     CustomerModel c2 = new CustomerModel(fixID,fixEmail,fixNumber);
                                                     userController.updateCustomer(c2);
                                                     break;
                                                 case 3:
                                                     int deleteID;
                                                     System.out.print("Nhập id khách hàng muốn xóa: ");
                                                     deleteID = sc.nextInt();
                                                     userController.deleteCustomer(deleteID);
                                                     break;
                                                 case 4:
                                                     CustomerModel c3 = new CustomerModel();
                                                     userController.selectCustomer(c3);
                                             }
                                             if(x == 0){
                                                 break;
                                             }
                                         }while (x!=0);

                                         break;
                                 }
                                 if (m==0){
                                     break;
                                 }
                                }while (m!=0);
                        }else{

                        }
                    }catch (SQLException ex){
                        ex.printStackTrace();
                    }
            }
        } while (n != 0);
    }
}
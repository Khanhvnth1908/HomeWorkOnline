package Ebookstore.EbookstoreController;

import Ebookstore.EbookstoreModel.BookModel;
import Ebookstore.EbookstoreModel.CustomerModel;
import Ebookstore.EbookstoreModel.UserModel;


import java.sql.*;
import java.util.Scanner;

public class User {
    Books userController = new Books();
    Scanner sc = new Scanner(System.in);
    Customer customer = new Customer();
    public void login(UserModel userModel){
        int x = 0;
        try(
                Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");
                Statement stmt = conn.createStatement();
                ){
            String login = "select * from user where user_name = '" + userModel.getUsername() + "'and password = '" + userModel.getPassword() + "'";
            ResultSet rset = stmt.executeQuery(login);
            if(rset.next()){
                System.out.println("=====Success=====");
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
                                        + "1-Thêm: id,name,price,qty,thể loại,author\n"
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
                                        customer.InsertCustomer(c1);
                                        break;
                                    case 2:
                                        System.out.print("Nhập ID bạn muốn sửa: ");
                                        int fixID = sc.nextInt();
                                        System.out.print("Nhập email mới: ");
                                        String fixEmail = sc.next();
                                        System.out.print("Nhập số điện thoại mới: ");
                                        String fixNumber = sc.next();
                                        CustomerModel c2 = new CustomerModel(fixID,fixEmail,fixNumber);
                                        customer.updateCustomer(c2);
                                        break;
                                    case 3:
                                        int deleteID;
                                        System.out.print("Nhập id khách hàng muốn xóa: ");
                                        deleteID = sc.nextInt();
                                        customer.deleteCustomer(deleteID);
                                        break;
                                    case 4:
                                        CustomerModel c3 = new CustomerModel();
                                        customer.selectCustomer(c3);
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

            }else {
                System.out.println("====Does't Exits====");
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
    public void Registration(UserModel user){
        try(
                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");
                Statement stmt = conn.createStatement();
        ){
            String insert = "insert into user(user_name,password,role) values(" + "'" + user.getUsername() + "','" + user.getPassword() + "'," + user.getRole() + ")";
            int count = stmt.executeUpdate(insert);
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}

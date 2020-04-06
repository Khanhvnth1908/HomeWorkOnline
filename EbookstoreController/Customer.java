package Ebookstore.EbookstoreController;

import Ebookstore.EbookstoreModel.CustomerModel;

import java.sql.*;

public class Customer {
    public void InsertCustomer(CustomerModel customer){
        try(
                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");
                PreparedStatement pstmt = conn.prepareStatement(
                        "INSERT into khach_hang(id,ten_kh,email,dia_chi,sdt_kh) values (?,?,?,?,?)");
        ){
            int id = customer.getId();
            String nameCustomer = customer.getName();
            String email = customer.getEmail();
            String address = customer.getAddress();
            String numberPhone = customer.getNumberPhone();

            pstmt.setInt(1,id);
            pstmt.setString(2,nameCustomer);
            pstmt.setString(3,email);
            pstmt.setString(4,address);
            pstmt.setString(5,numberPhone);
            int rowInsert = pstmt.executeUpdate();

        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public void updateCustomer(CustomerModel customer){
        try (
                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");
                PreparedStatement pstmt = conn.prepareStatement(
                        "update khach_hang set email = ?,sdt_kh = ? where id = ?");
        ){
            int id = customer.getId();
            String email = customer.getEmail();
            String numberPhone = customer.getNumberPhone();

            pstmt.setString(1,email);
            pstmt.setString(2,numberPhone);
            pstmt.setInt(3,id);
            int rowUpdate = pstmt.executeUpdate();
            System.out.println(rowUpdate + "row affected ");
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public void deleteCustomer(int id){
        try(
                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");
                PreparedStatement pstmt = conn.prepareStatement(
                        "DELETE from khach_hang where id = ?");
        ){
            pstmt.setInt(1,id);
            int rowDelete = pstmt.executeUpdate();

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
            //
            ResultSet rset = stmt.executeQuery("select * from khach_hang");

            ResultSetMetaData rsetMD = rset.getMetaData();

            int numcolumn = rsetMD.getColumnCount();

            for (int i = 1; i<= numcolumn;++i){
                System.out.printf("%-30s", rsetMD.getColumnName(i));
            }
            System.out.println();

            for (int i = 1;i <=numcolumn;++i){
                System.out.printf("%-30s",
                        "(" + rsetMD.getColumnClassName(i) + ")");
            }
            System.out.println();

            while (rset.next()){
                for (int i = 1;i<=numcolumn;++i){
                    System.out.printf("%-30s", rset.getString(i));
                }
                System.out.println();
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

}

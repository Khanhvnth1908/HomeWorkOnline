package Ebookstore.Cart;

import Test.Contact;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class AddCart {
    Scanner sc = new Scanner(System.in);

    public void cart() {

        ArrayList<Items> ItemsList = new ArrayList<>();
        System.out.print("Nhập id: ");
        int id = sc.nextInt();
        System.out.println("Nhập product_id: ");
        int pro_id = sc.nextInt();
        System.out.print("Nhập số lượng: ");
        int qty = sc.nextInt();
        System.out.print("Nhập giá: ");
        double price = sc.nextDouble();
        Items items1 = new Items(id, pro_id, qty,price);
        ItemsList.add(items1);

        Iterator<Items> itemsIterator = ItemsList.iterator();
        while (itemsIterator.hasNext()){
            Items items = itemsIterator.next();
            System.out.println(items);
        }
        try (
                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");
        ){
            PreparedStatement prstmt = conn.prepareStatement(
                    "update sach set so_luong_sach = so_luong_sach - ? where id = ?");
            int id1 = items1.getId();
            int qty1 = items1.getQty();
            prstmt.setInt(1,qty1);
            prstmt.setInt(2,id1);
            int column = prstmt.executeUpdate();


            Statement stmt = conn.createStatement();
            System.out.println("--------------------Số lượng còn lại sau khi mua-----------------");
            ResultSet rset = stmt.executeQuery("Select * from sach where id = " + items1.getId());

            ResultSetMetaData rsetMD = rset.getMetaData();

            int numcolumn = rsetMD.getColumnCount();

            for (int i = 1; i <= numcolumn; i++) {
                System.out.printf("%-45s", rsetMD.getColumnName(i));
            }
            System.out.println();

            for (int i = 1; i <= numcolumn; i++) {
                System.out.printf("%-45s",
                        "(" + rsetMD.getColumnClassName(i) + ")");
            }
            System.out.println();

            while (rset.next()) {
                for (int i = 1; i <= numcolumn; i++) {
                    System.out.printf("%-45s", rset.getString(i));
                }
                System.out.println();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}

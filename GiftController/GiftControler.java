package Java2_06.GiftController;


import Java2_06.GiftModel.Gift;
import java.sql.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class GiftControler {
    Scanner sc = new Scanner(System.in);
    public void selectAll(){
    try (
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/egift?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                    "root",
                    "");
            Statement stmt = conn.createStatement();
    ){
        String selectAll = "select * from gift";
        System.out.println("The SQL statement is: " + selectAll);
        ResultSet rset = stmt.executeQuery(selectAll);

        while (rset.next()){
            int id = rset.getInt("id");
            String name = rset.getString("name");
            double price = rset.getDouble("price");
            int qty = rset.getInt("qty");
            System.out.println(id + ", " + name + ", " + price + ", " + qty);
        }
    }catch (SQLException ex){
        ex.printStackTrace();
    }
}

    public void InsertGift(Gift gift){
        try (
                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/egift?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");
                Statement stmt = conn.createStatement();
        ){
            String idNew;
            String nameNew;
            String priceNew;
            int qtyNew;
            System.out.print("Nhập id: " + "\n");
            idNew = sc.nextLine();
            gift.id = idNew;
            System.out.print("Nhập tên: " + "\n");
            nameNew = sc.nextLine();
            gift.name = nameNew;
            System.out.print("Nhập giá: " + "\n");
            priceNew = sc.nextLine();
            gift.price = priceNew;
            System.out.print("Nhập số lượng: " + "\n");
            qtyNew = sc.nextInt();
            gift.qty = qtyNew;
            String Insert = "Insert into gift value (" + gift.getId() + ", " + "'"+ gift.getName() + "'" + ", " + gift.getPrice() + ", " + gift.getQty() + ")";
            int count = stmt.executeUpdate(Insert);

        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public void Delete(Gift gift){
        try (
                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/egift?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");
                Statement stmt = conn.createStatement();
                ){
            int id;
            System.out.print("Nhap Id cuon sach muon xoa: ");
            id = sc.nextInt();
            String delete = "DELETE FROM gift where id =" + id;
            int count = stmt.executeUpdate(delete);

        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }



}

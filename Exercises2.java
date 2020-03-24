package Java2_04;

import java.sql.*;
import java.util.Scanner;
public class Exercises2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      try(
              Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/norwind?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                      "root",
                      "");
              Statement statement = conn.createStatement();
              ){

          //In all tu khach hang
          String selectCustomer = "select * from customers";
          System.out.println("The SQL Statement is: " + selectCustomer);
          ResultSet resultSet = statement.executeQuery(selectCustomer);

          System.out.println("The record selected are: ");
          int rowcount = 0;
          while (resultSet.next()){
              String CustomersID = resultSet.getString("CustomerID");
              String CompanyName = resultSet.getString("CompanyName");
              String ContactName = resultSet.getString("ContactName");
              String ContactTitle = resultSet.getString("ContactTitle");
              String Address = resultSet.getString("Address");
              String City = resultSet.getString("City");
              String Region = resultSet.getString("Region");
              String PostalCode = resultSet.getString("PostalCode");
              String Country = resultSet.getString("Country");
              String Phone = resultSet.getString("Phone");
              String Fax = resultSet.getString("Fax");
              System.out.println(CustomersID + ", " + CompanyName + ", " + ContactName + ", "
                      + ContactTitle + ", " + Address + ", " + City + ", " + Region + ", " + PostalCode + ", " + Country + ", " + Phone +
                      ", " + Fax);
              rowcount++;
          }
          System.out.println("Total number record: " + rowcount);
          System.out.println();


          //Tim khach hang theo ten

          String strselectName = "select * from Customers where ContactName = 'Maria Anders'";
          System.out.println("The SQL statement is: " + selectCustomer);
          ResultSet rset = statement.executeQuery(strselectName);

          System.out.println("The record selected are: ");
          int rowcount2 =0;
          while (rset.next()){
              String CustomerID = rset.getString("CustomerID");
              String ContactName = rset.getString("ContactName");
              String CompanyName = rset.getString("CompanyName");
              String ContactTitle = rset.getString("ContactTitle");
              String Address = rset.getString("Address");
              String City = rset.getString("City");
              String Region = rset.getString("Region");
              String PostalCode = rset.getString("PostalCode");
              String Country = rset.getString("Country");
              String Phone = rset.getString("Phone");
              String Fax = rset.getString("Fax");
              System.out.println(CustomerID + ", " + CompanyName + ", " + ContactName + ", "
                      + ContactTitle + ", " + Address + ", " + City + ", " + Region + ", " + PostalCode + ", " + Country + ", " + Phone +
                      ", " + Fax);
              rowcount2++;
          }
          System.out.println("Total number record: " + rowcount2);
          System.out.println();

          //Hiển thị dnah sahc snar phẩm

          String selectProduct = "select * from products";
          System.out.println("The SQL statement is: " + selectProduct);
          ResultSet resultSet2 = statement.executeQuery(selectProduct);

          System.out.println("The record selected are: ");
          int rowcount3 = 0;
          while (resultSet2.next()){
              int ProductID = resultSet2.getInt("ProductID");
              String ProductName = resultSet2.getString("ProductName");
              int SupplierID = resultSet2.getInt("SupplierID");
              int CategoryID = resultSet2.getInt("CategoryID");
              String QuantityPerUnit = resultSet2.getString("QuantityPerUnit");
              double UnitPrice = resultSet2.getDouble("UnitPrice");
              int UnitsInStock = resultSet2.getInt("UnitsInStock");
              int UnitsOnOrder = resultSet2.getInt("UnitsOnOrder");
              int ReOrderLevel = resultSet2.getInt("ReOrderLevel");
              int Discontinued = resultSet2.getInt("Discontinued");
              System.out.println(ProductID + ", " + ProductName + ", " + SupplierID + ", "
                      + CategoryID + ", " + QuantityPerUnit + ", " + UnitPrice + ", " + UnitsInStock + ", " + UnitsOnOrder +
                      ", " + ReOrderLevel + ", " + Discontinued);
              rowcount3++;
          }
          System.out.println("Total number record: " + rowcount3);
          System.out.println();

          //tim san pham theo gia ban do nguoi dung nhap
          String selectNameProdcut = "select * from products where UnitPrice >=30";
          System.out.println("The SQL statement is: " + selectNameProdcut);
          ResultSet resultSet3 = statement.executeQuery(selectNameProdcut);

          System.out.println("The record selected are: ");
          int rowcount4 = 0;
          while (resultSet3.next()){
              int ProductID = resultSet3.getInt("ProductID");
              String ProductName = resultSet3.getString("ProductName");
              int SupplierID = resultSet3.getInt("SupplierID");
              int CategoryID = resultSet3.getInt("CategoryID");
              String QuantityPerUnit = resultSet3.getString("QuantityPerUnit");
              double UnitPrice = resultSet3.getDouble("UnitPrice");
              int UnitsInStock = resultSet3.getInt("UnitsInStock");
              int UnitsOnOrder = resultSet3.getInt("UnitsOnOrder");
              int ReOrderLevel = resultSet3.getInt("ReOrderLevel");
              int Discontinued = resultSet3.getInt("Discontinued");
              System.out.println(ProductID + ", " + ProductName + ", " + SupplierID + ", "
                      + CategoryID + ", " + QuantityPerUnit + ", " + UnitPrice + ", " + UnitsInStock + ", " + UnitsOnOrder +
                      ", " + ReOrderLevel + ", " + Discontinued);
              rowcount4++;
          }
          System.out.println("Total number record: " + rowcount4);
          System.out.println();

           //In ra thong tin chi tiet cua 1 don hang
          String selectOder = "select * from orders where OrderID = 10248";
          System.out.println("The SQL statement is: " + selectOder);
          ResultSet resultSet4 = statement.executeQuery(selectOder);

          System.out.println("The record selected are: ");
          int rowcount5 = 0;
          while (resultSet4.next()){
              int OrderID = resultSet4.getInt("OrderID");
              String CustomerID = resultSet4.getString("CustomerID");
              int EmployeeID = resultSet4.getInt("EmployeeID");
              String OrderDate = resultSet4.getString("OrderDate");
              String RequiredDate = resultSet4.getString("RequiredDate");
              String ShippedDate = resultSet4.getString("ShippedDate");
              int ShipVia = resultSet4.getInt("ShipVia");
              int Freight = resultSet4.getInt("Freight");
              String ShipName = resultSet4.getString("ShipName");
              String ShipAddress = resultSet4.getString("ShipAddress");
              String ShipCity = resultSet4.getString("ShipCity");
              String ShipRegion = resultSet4.getString("ShipRegion");
              String ShipPostalCode = resultSet4.getString("ShipPostalCode");
              String ShipCountry = resultSet4.getString("ShipCountry");
              System.out.println(OrderID + ", " + CustomerID + ", " + EmployeeID + ", "
                      + OrderDate + ", " + RequiredDate + ", " + ShippedDate + ", " + ShipVia + ", " + Freight +
                      ", " + ShipName + ", " + ShipAddress + ShipCity + ", " + ShipRegion + ", " + ShipPostalCode + ", " + ShipCountry );
              rowcount5++;
          }
          System.out.println("Total number record: " + rowcount5);
          System.out.println();

      }catch (SQLException ex){
          ex.printStackTrace();
      }
    }
}

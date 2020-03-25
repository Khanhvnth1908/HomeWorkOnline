package Ebookstore;

import java.sql.*;
import java.util.Scanner;
public class Ebookstore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try(
                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");
                Statement stm = conn.createStatement();
        ){
            String selectbook = "select * from sach where tinh_trang = 'new products' limit 3";
            System.out.println("The SQL statement is: " + selectbook);
            ResultSet rset = stm.executeQuery(selectbook);

            System.out.println("The record selected are: ");
            int rowcount = 0;
            while (rset.next()){
                String ten_sach = rset.getString("ten_sach");
                String tinh_trang = rset.getString("tinh_trang");
                System.out.println(ten_sach + ", " + tinh_trang);
                rowcount++;
            }
            System.out.println("Total number record: " + rowcount);
            System.out.println();


            String selectbook1 = "select * from sach order by id ASC limit 5";
            System.out.println("The SQL statement is: " + selectbook1);
            ResultSet rset1 = stm.executeQuery(selectbook1);

            System.out.println("The record selected are: ");
            int rowcount1 = 0;
            while (rset1.next()){
                int id = rset1.getInt("id");
                String ten_sach = rset1.getString("ten_sach");
                String so_luong_sach = rset1.getString("so_luong_sach");
                String gia = rset1.getString("gia");
                String ngay_xb = rset1.getString("ngay_xb");
                int lan_xb = rset1.getInt("lan_xb");
                String ma_sach = rset1.getString("ma_sach");
                String tinh_trang = rset1.getString("tinh_trang");
                System.out.println(ten_sach + ", " + so_luong_sach + ", " + gia + ", " + ngay_xb + ", " + lan_xb + ", " + ma_sach + ", " + tinh_trang);
                rowcount1++;
            }
            System.out.println("Total number record: " + rowcount1);
            System.out.println();
//------------------------------------
            String category;
            String selectbook2 = "select * from the_loai inner  join sach on the_loai.id = sach.the_loai_id  where ten_the_loai = ";
            System.out.print("Enter 'Category'---->: ");
            category = sc.nextLine();
            selectbook2 = selectbook2.concat("'" + category + "'");
            System.out.println(selectbook2);
            ResultSet rset2 = stm.executeQuery(selectbook2);

            System.out.println("The record selected are: ");
            int rowcount2 = 0;
            while (rset2.next()){
                int id = rset2.getInt("id");
                String ten_sach = rset2.getString("ten_sach");
                String so_luong_sach = rset2.getString("so_luong_sach");
                String gia = rset2.getString("gia");
                String ngay_xb = rset2.getString("ngay_xb");
                int lan_xb = rset2.getInt("lan_xb");
                String ma_sach = rset2.getString("ma_sach");
                String tinh_trang = rset2.getString("tinh_trang");
                String ten_the_loai = rset2.getString("ten_the_loai");
                System.out.println(ten_sach + ", " + so_luong_sach + ", " + gia + ", " + ngay_xb + ", " + lan_xb + ", " + ma_sach + ", " + tinh_trang + ", " + ten_the_loai);
                rowcount2++;
            }
            System.out.println("Total number record: " + rowcount2);
            System.out.println();
    //--------------------------------------
            String sachId;
            String selectbook3 = "select * from sach where id =";
            System.out.print("Nhập ID của sách: ");
            sachId = sc.nextLine();
            selectbook3 = selectbook3.concat(sachId);
            System.out.println("The SQL statement is: " + selectbook3);
            ResultSet rset3 = stm.executeQuery(selectbook3);

            System.out.println("The record selected are: ");
            int rowcount3 = 0;
            while (rset3.next()){
                int id = rset3.getInt("id");
                String ten_sach = rset3.getString("ten_sach");
                String so_luong_sach = rset3.getString("so_luong_sach");
                String gia = rset3.getString("gia");
                String ngay_xb = rset3.getString("ngay_xb");
                int lan_xb = rset3.getInt("lan_xb");
                String ma_sach = rset3.getString("ma_sach");
                String tinh_trang = rset3.getString("tinh_trang");
                System.out.println(ten_sach + ", " + so_luong_sach + ", " + gia + ", " + ngay_xb + ", " + lan_xb + ", " + ma_sach + ", " + tinh_trang);
                rowcount3++;
            }
            System.out.println("Total number record: " + rowcount3);
            System.out.println();

            //-----------------------------------------------------------
            String nameAuthor;
            String selectbook4 = "select * from sach_nxb inner join sach on sach_nxb.sach_id = sach.id inner join nxb on sach_nxb.nxb_id = nxb.id where ten_nxb =";
            System.out.println("The SQL statement is: " + selectbook4);
            System.out.print("Nhập tên của tác giả: ");
            nameAuthor = sc.nextLine();
            selectbook4 = selectbook4.concat("'" + nameAuthor + "'");
            ResultSet resultSet = stm.executeQuery(selectbook4);

            int rowcount4 = 0;
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String ten_sach = resultSet.getString("ten_sach");
                String so_luong_sach = resultSet.getString("so_luong_sach");
                String gia = resultSet.getString("gia");
                String ngay_xb = resultSet.getString("ngay_xb");
                int lan_xb = resultSet.getInt("lan_xb");
                String ma_sach = resultSet.getString("ma_sach");
                String tinh_trang = resultSet.getString("tinh_trang");
                String ten_nxb = resultSet.getString("ten_nxb");
                System.out.println(ten_sach + ", " + so_luong_sach + ", " + gia + ", " + ngay_xb + ", " + lan_xb + ", " + ma_sach + ", " + tinh_trang + ", " + ten_nxb);
                rowcount4++;
            }
            System.out.println("Total number record: " + rowcount4);
            System.out.println();

            //-----------------------Hien thi Hoa Don--------------------------------//

            String selectOrder = "select * from sach inner join don_hang_chi_tiet on sach.id = don_hang_chi_tiet.sach_id where tinh_trang_don_hang = 'Moi tiep nhan' limit 3";
            System.out.println("This SQL statement: " + selectOrder);
            ResultSet resultSet1 = stm.executeQuery(selectOrder);

            int rowcount5 = 0;
            while (resultSet1.next()){
                int id = resultSet1.getInt("id");
                String ten_sach = resultSet1.getString("ten_sach");
                String so_luong_sach = resultSet1.getString("so_luong");
                String gia = resultSet1.getString("gia");
                String ngay_xb = resultSet1.getString("ngay_xb");
                int lan_xb = resultSet1.getInt("lan_xb");
                String ma_sach = resultSet1.getString("ma_sach");
                String tinh_trang_don_hang  = resultSet1.getString("tinh_trang_don_hang");
                System.out.println(ten_sach + ", " + so_luong_sach + ", " + gia + ", " + ngay_xb + ", " + lan_xb + ", " + ma_sach + ", " + tinh_trang_don_hang);
                rowcount5++;
            }
            System.out.println("Total number record: " + rowcount5);
            System.out.println();

            String selectOrder1 = "select * from don_hang_chi_tiet inner join khach_hang on don_hang_chi_tiet.kh_id = khach_hang.id inner join sach on don_hang_chi_tiet.sach_id = sach.id where kh_id =331";
            System.out.println("This SQL statement: " + selectOrder1);
            ResultSet resultSet2 = stm.executeQuery(selectOrder1);

            int rowcount6 = 0;
            while (resultSet2.next()){
                int id = resultSet2.getInt("id");
                String ten_sach = resultSet2.getString("ten_sach");
                int so_luong = resultSet2.getInt("so_luong");
                double tong_tien = resultSet2.getDouble("tong_tien");
                String ma_sach = resultSet2.getString("ma_sach");
                int kh_id = resultSet2.getInt("kh_id");
                System.out.println(ten_sach + ", " + so_luong + ", " + tong_tien + ", " + kh_id);
                rowcount6++;
            }
            System.out.println("Total number record: " + rowcount6);
            System.out.println();


            String selectOrder2 = "select * from don_hang_chi_tiet inner join khach_hang on don_hang_chi_tiet.kh_id = khach_hang.id inner join sach on don_hang_chi_tiet.sach_id = sach.id where kh_id =331";
            System.out.println("This SQL statement: " + selectOrder2);
            ResultSet resultSet3= stm.executeQuery(selectOrder2);

            int rowcount7 = 0;
            while (resultSet3.next()){
                int id = resultSet3.getInt("id");
                String tinh_trang_don_hang = resultSet3.getString("tinh_trang_don_hang");
                int kh_id = resultSet3.getInt("kh_id");
                String ten_sach = resultSet3.getString("ten_sach");
                double tong_tien = resultSet3.getDouble("tong_tien");
                String ten_kh = resultSet3.getString("ten_kh");
                System.out.println(kh_id + ", " +  ten_kh + ", " + tong_tien  + ", " + tinh_trang_don_hang);
                rowcount7++;
            }
            System.out.println("Total number record: " + rowcount7);
            System.out.println();

            String idOrder;
            String selectOrder3 = "select * from don_hang_chi_tiet inner join khach_hang on don_hang_chi_tiet.kh_id = khach_hang.id inner join sach on don_hang_chi_tiet.sach_id = sach.id where ma_don_hang_chi_tiet =";
            System.out.print("Enter ma don hang chi tiet: " );
            idOrder = sc.nextLine();
            selectOrder3 = selectOrder3.concat("'" + idOrder + "'");
            System.out.println("This SQL statement: " + selectOrder3);
            ResultSet resultSet4 = stm.executeQuery(selectOrder3);

            int rowcount8 = 0;
            while (resultSet4.next()){
                String ten_sach = resultSet4.getString("ten_sach");
                int so_luong = resultSet4.getInt("so_luong");
                double tong_tien = resultSet4.getDouble("tong_tien");
                String ma_sach = resultSet4.getString("ma_sach");
                String ten_kh = resultSet4.getString("ten_kh");
                int kh_id = resultSet4.getInt("kh_id");
                String tinh_trang_don_hang = resultSet4.getString("tinh_trang_don_hang");
                System.out.println(kh_id + ", " + ten_kh + ", "+ ten_sach + ", " + so_luong + ", " + tong_tien + ", " + tinh_trang_don_hang);
                rowcount8++;
            }
            System.out.println("Total number record: " + rowcount8);
            System.out.println();



            String idOrder1;
            String selectOrder4 = "select * from don_hang_chi_tiet inner join khach_hang on don_hang_chi_tiet.kh_id = khach_hang.id where tinh_trang_don_hang = ";
            System.out.print("Enter tinh trang don hang: " );
            idOrder1 = sc.nextLine();
            selectOrder4 = selectOrder4.concat("'" + idOrder1 + "'");
            System.out.println("This SQL statement: " + selectOrder4);
            ResultSet resultSet5 = stm.executeQuery(selectOrder4);

            int rowcount9 = 0;
            while (resultSet5.next()){
                String ma_don_hang_chi_tiet = resultSet5.getString("ma_don_hang_chi_tiet");
                String tinh_trang_don_hang =resultSet5.getString("tinh_trang_don_hang");
                String ten_kh = resultSet5.getString("ten_kh");
                int kh_id = resultSet5.getInt("kh_id");
                System.out.println(ma_don_hang_chi_tiet + ", " + tinh_trang_don_hang  + ", " +  ten_kh + ", " + kh_id );
                rowcount9++;
            }
            System.out.println("Total number record: " + rowcount9);
            System.out.println();


        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}

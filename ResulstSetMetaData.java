package Ebookshop;


import java.sql.*;


public class ResulstSetMetaData {
    public static void main(String[] args) {
        try(
                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");
                Statement stmt = conn.createStatement();
                ){

            //Bước 3 & 4: Truy vấn và xử lý kết quả truy vấn
            ResultSet rset = stmt.executeQuery("select * from books");

            //lấy siêu dữ liệu của kết quả
            ResultSetMetaData rsetMD = rset.getMetaData();

            //lấy số lượng cột từ siêu dữ liệu
            int numcolumn = rsetMD.getColumnCount();

            //in tên cột - chỉ mục cột bắt đầu từ 1 (ví dụ 0)
            for (int i =1;i <= numcolumn;++i){
                System.out.printf("%-30s",rsetMD.getColumnName(i));
            }
            System.out.println();

            //In te lop
            for (int i = 1;i <= numcolumn;++i ){
                System.out.printf("%-30s",
                        "(" + rsetMD.getColumnClassName(i) + ")");
            }
            System.out.println();

            //
            while (rset.next()){
                for (int i = 1;i <= numcolumn;i++){
                    System.out.printf("%-30s", rset.getString(i));
                }
                System.out.println();
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}

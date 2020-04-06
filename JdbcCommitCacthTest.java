package Ebookshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCommitCacthTest {
    public static void main(String[] args) throws SQLException {    // *Note*: throws SQLException
        try(
                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");
                Statement stmt = conn.createStatement();
                ){
                    try {
                            //Vô hiệu hóa tự động cam kết
                            conn.setAutoCommit(false);

                             //Phát hành hai câu lệnh Chèn
                            stmt.executeUpdate("insert into books value(1010,'Tony Stark','Mahjong 101',4.4,4)");
                            //
                            //Sao chép khóa chính sẽ kích hoạt nhận thức SQLException
                            stmt.executeUpdate("insert into books value(1011,'Peter Parker','Manjong 102',4.4,4)");
                            conn.commit();    /// Cam kết chỉ thay đổi nếu tất cả các tuyên bố thành công
            }catch (SQLException ex){
                System.out.println("--------Rolling back changes-------");
                conn.rollback();
                ex.printStackTrace();

            }
        }
    }
}


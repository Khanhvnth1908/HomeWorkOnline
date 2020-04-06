package Ebookshop;

import java.sql.*;

public class PreparedStatements {
    public static void main(String[] args) {
        try(
                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");
            //Two prepareStatement,one for Insert and one for select
                PreparedStatement pstm = conn.prepareStatement(
                        "INSERT  into books values(?,?,?,?,?)");
                PreparedStatement pstmSelect = conn.prepareStatement("select  * from books");
                ){
            pstm.setInt(1, 1006);
            pstm.setString(2, "Mahjong 103");
            pstm.setString(3, "Kumar");
            pstm.setDouble(4,88.6);
            pstm.setInt(5,88);
            int rowInserted = pstm.executeUpdate();
            System.out.println(rowInserted + "row affected ");

            pstm.setInt(1,1007);
            pstm.setString(2,"Mahjong 105");
            rowInserted = pstm.executeUpdate();
            System.out.println(rowInserted + "row affected.");


            ResultSet rset = pstmSelect.executeQuery();
            while (rset.next()){
                System.out.println(rset.getInt("id") + ", "
                        + rset.getString("author") + ", "
                        + rset.getString("title") + ", "
                        + rset.getDouble("price")  + ", "
                        + rset.getInt("qty"));
            }

        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}

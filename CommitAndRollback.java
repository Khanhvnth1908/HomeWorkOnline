package Ebookshop;

        import java.sql.*;

public class CommitAndRollback {
    public static void main(String[] args) {
        try (
                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                       "root",
                        "");
                Statement stmt = conn.createStatement();
        ){

         //Disable auto commit for the connection
            conn.setAutoCommit(false);

         //Before Changes
            ResultSet rset = stmt.executeQuery("select id,qty from books where id in(1001,1002)");
            System.out.println("===BEFORE UPDATE===");
            while (rset.next()){
                System.out.println(rset.getInt("id") + ", " + rset.getInt("qty"));
            }
            conn.commit();   //commit select


          //Inso two update statements thru excuteupdate()
//            stmt.executeUpdate("update books set qty = qty + 1 where id = 1001");
//            stmt.executeUpdate("update books set qty = qty + 1 where id = 1002");
//            conn.commit();   //commit update

//            rset = stmt.executeQuery("select id,qty from books where id in (1001,1002)");
//            System.out.println("====AFTER UPDATE AND COMMIT===");
//            while (rset.next()){
//                System.out.println(rset.getInt("id") + ", " + rset.getInt("qty"));
//            }
//            conn.commit();   //commit select


            //Inso two update statements thru excuteupdate()
            stmt.executeUpdate("update books set qty = qty - 99 where id = 1001");
            stmt.executeUpdate("update books set qty = qty - 99 where id = 1002");
            conn.rollback();   //Discord all change since the last commit

            rset = stmt.executeQuery("select id,qty from books where id in(1001,1002)");
            System.out.println("===After update and rollback====");
            while (rset.next()){
                System.out.println(rset.getInt("id") + ", " + rset.getInt("qty"));
            }
            conn.commit();   //commit select

        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}

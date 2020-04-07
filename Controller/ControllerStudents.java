package Students.Controller;

import Students.Model.ModelStudents;
import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ControllerStudents {
    Scanner sc = new Scanner(System.in);
    List<ModelStudents> ListStudents = new ArrayList<>();

    public void Insert(){
        System.out.print("Enter ID: ");
        String StID = sc.next();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        name = sc.nextLine();
        System.out.print("Enter Address: ");
        String address = sc.nextLine();
        System.out.print("Enter NumberPhone: ");
        String numberPhone = sc.next();
        ModelStudents modelStudents = new ModelStudents(StID,name,address,numberPhone);
        ListStudents.add(modelStudents);

        Iterator<ModelStudents> studentsIterator = ListStudents.iterator();
        while (studentsIterator.hasNext()){
            ModelStudents students = studentsIterator.next();
            System.out.println(students);
        }
    }

    public void Select(){
        try(
                Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/students?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");
                Statement stmt = conn.createStatement();
        ){
            ResultSet rset = stmt.executeQuery("select * from students");

            ResultSetMetaData rsetMD = rset.getMetaData();

            int column = rsetMD.getColumnCount();

            for (int i = 1;i<= column;i++){
                System.out.printf("%-30s", rsetMD.getColumnName(i));
            }
            System.out.println();

            for (int i = 1;i<=column;i++){
                System.out.printf("%-30s",
                        "(" + rsetMD.getColumnClassName(i) + ")");
            }
            System.out.println();

            while (rset.next()){
                for (int i = 1;i<=column;i++){
                    System.out.printf("%-30s", rset.getString(i));
                }
                System.out.println();
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public void save(){
        try(
                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/students?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");
                PreparedStatement prstmt = conn.prepareStatement(
                        "insert into students values (?,?,?,?)");
                ){
            
            conn.setAutoCommit(false);
            for (int i=0;i<this.ListStudents.size();i++){
            prstmt.setString(1,ListStudents.get(i).getStudentId());
                prstmt.setString(2,ListStudents.get(i).getStudentName());
                prstmt.setString(3,ListStudents.get(i).getAddress());
                prstmt.setString(4,ListStudents.get(i).getPhone());
                prstmt.addBatch();
                prstmt.executeUpdate();
            }

        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }



}

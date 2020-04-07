package Students.View;

import Students.Controller.ControllerStudents;
import Students.Model.ModelStudents;

import java.util.Scanner;
public class View {
    public static void main(String[] args) {
        ControllerStudents controllerStudents = new ControllerStudents();
        Scanner sc = new Scanner(System.in);
        int a;
        do{
            System.out.println("1. Add student records\n"
            + "2. Display student records\n"
            + "3. Save\n"
            + "4. Exit\n");
            do {
                System.out.println("Enter: ");
                a = sc.nextInt();
            }while (a<1 || a>4);
            switch (a){
                case 1:
                    controllerStudents.Insert();
                    break;
                case 2:
                    controllerStudents.Select();
                    break;
                case 3:
                    controllerStudents.save();
                    break;
            }
            if (a==4){
                System.out.println("Program inactive");
                break;
            }
        }while(a!=0);
    }
}

package Ebookstore.EbookstoreVeiw;

import Ebookstore.EbookstoreController.User;
import Ebookstore.EbookstoreController.Books;
import Ebookstore.EbookstoreModel.UserModel;
import java.util.Scanner;

public class viewStaff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Books userController = new Books();
        User user = new User();
        int x;
        do{
            System.out.println("1-Registion\n"
            + "2-Login\n");
            do {
                System.out.print("Nhập yêu cầu của bạn: ");
                x = sc.nextInt();
                switch (x){
                    case 1:
                        System.out.print("User name: ");
                        String name = sc.nextLine();
                        name = sc.nextLine();
                        System.out.print("Password: ");
                        String password = sc.nextLine();
                        System.out.println("Role: ");
                        int role = sc.nextInt();
                        UserModel userModel = new UserModel(name,password,role);
                        user.Registration(userModel);
                    break;
                    case 2:
                        System.out.print("User name: ");
                        String name2 = sc.nextLine();
                        name2 = sc.nextLine();
                        System.out.print("Password: ");
                        String password2 = sc.nextLine();
                       UserModel usermoderl1 = new UserModel(name2,password2);
                       user.login(usermoderl1);
                    break;
                }
            }while (x<1 || x>2);
        }while (x!=0);
    }
}

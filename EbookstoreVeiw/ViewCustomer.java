package Ebookstore.EbookstoreVeiw;

import Ebookstore.Cart.AddCart;
import Ebookstore.Cart.Items;
import Ebookstore.EbookstoreController.CustomerCheckOut;
import Ebookstore.EbookstoreController.User;
import Ebookstore.EbookstoreController.Books;
import Ebookstore.EbookstoreModel.UserModel;

import java.util.Scanner;

public class ViewCustomer {
    public static void main(String[] args) {
        Books userController = new Books();
        User user = new User();
        AddCart addCart = new AddCart();
        Items items = new Items();
        CustomerCheckOut checkOut = new CustomerCheckOut();
        Scanner sc = new Scanner(System.in);
        //
        System.out.println("----------Danh sách các sản phẩm---------\n"
        + "1-Zen and the Art of Motorcycle Maintenance\n"
        + "2-Watership Down\n"
        + "3-The Last Lecture\n"
        + "4-A Short History of Nearly Everything\n"
        + "5-Man's Search for Meaning\n"
        + "6-Home\n"
        + "7-The Kings\n"
        + "8-Home Comming\n"
        + "Bạn sẽ chọn mua sản phẩm nào của chúng tôi?\n");

        int m=0;
        do{
            System.out.print("1-Mua hàng\n"
            + "2-Dừng mua hàng\n");
            do{
                System.out.print("Nhập yêu cầu của bạn: ");
                m = sc.nextInt();
                switch (m){
                    case 1:
                        addCart.cart();
                        break;
                    case 2:
                        System.out.println("Bạn có muốn thực hiện thanh toán không?");
                        int a;
                        do{
                            System.out.println("1-Yes\n" +
                                    "2-No\n");
                            do {
                                System.out.println("Nhập yêu cầu: ");
                                a = sc.nextInt();
                                switch (a){
                                    case 1:
                                        System.out.print("Nhập email: ");
                                        String email = sc.next();
                                        checkOut.checkEmail(email);
                                     break;
                                }
                                break;
                            }while (a<1 || a>2);
                            if (a==2){
                                break;
                            }
                        }while (a!=0);
                        break;
                }
            }while (m<1 || m>2);
        }while (m!=0);
    }
}
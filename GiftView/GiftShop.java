package Java2_06.GiftView;

import Java2_06.GiftController.GiftControler;
import Java2_06.GiftModel.Gift;

import java.util.Scanner;

public class GiftShop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        GiftControler giftControler = new GiftControler();
        Gift g1 = new Gift();
        do {
            do{
                System.out.println("<!----------Yêu Cầu của bạn---------!>" + "\n");
                System.out.println("1.Hiển thị toàn bộ đồ uống trong database \n"
                        +"2.Nhập thêm đồ uống \n"
                        +"3.Xóa đồ uống theo ID \n");
                System.out.print("Nhập n: ");
                n = sc.nextInt();
            }while (n<0 || n>3);
            switch (n) {
                case 1:
                    giftControler.selectAll();
                    break;
                case 2:
                    giftControler.InsertGift(g1);
                    break;
                case 3:
                    giftControler.Delete(g1);
            }
        }while (n != 0);
    }

}


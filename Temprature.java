package Java2_02;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Temprature {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        Integer number,n;
        int num = 0;
        System.out.println("\n Nhap so ngay can nhap nhiet do:");
        n = src.nextInt();
        System.out.println("Enter 5 Integer Values. ");
        for (int i = 0;i < n;i++) {
            numbers.add(src.nextInt());
            number = numbers.get(i);
            System.out.println("\n Element: " + i + ", typed values was: " + number);
            num+=number;
        }
        System.out.println("\n Average is: " + (double)num/5);
    }
}

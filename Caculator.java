package Java2_02;

import java.util.Scanner;

public class Caculator {
    public static void main(String[] args) {
        int n,sum = 0;
        Scanner src = new Scanner(System.in);
        do{
            System.out.println("\n Nhap so phan tu cua mang: ");
            n = src.nextInt();
        }while (n<0);

        int array[] = new int[n];
        System.out.println("\n nhap gia tri phan tu trong mang: ");
        for (int i =0;i < n;i++){
            System.out.println("\n nhap phan tu thu: " + i);
            array[i] = src.nextInt();
            sum+=array[i];
        }
        double average = (double) sum/5;
        System.out.println("Average= " + average);
    }

}

package Java2_02;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class MovieList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> film = new ArrayList<>();
        String nameFilm;
        Integer x;
        Integer n;
        Integer m=0;
        Integer selection= 0;
        System.out.println("Nhap so bo phim yeu thich: ");
        n = sc.nextInt();
        for (int i = 0;i<n;i++){
            System.out.println("\n nhap ten bo phim yeu thich thu: " + i );
            film.add(sc.next());
            System.out.println("Bo phim yeu thich " + i + " la:" + film.get(i));
        }
        System.out.println();
        do{
            System.out.println("1.Them phim moi");
            System.out.println("2.In ra danh sach cac bo phim yeu thich");
            System.out.println("3.Chinh sua ten phim da co");
            System.out.println("4.Xoa di 1 bo phim khoi danh sach yeu thich");
            System.out.println("5.Tim kiem ten phim trong danh sach yeu thich");
            selection = sc.nextInt();
            switch (selection){
                case 1:
                    System.out.println("\n Nhap ten phim ban muon them");
                    film.add(sc.next());
                    System.out.println("Danh sach cac bo phim yeu thich la: " + film);
                    break;
                case 2:
                    System.out.println("\n Danh sach cac bo phim yeu thich cua ban la: " + film);
                    break;
                case 3:
                    System.out.println("\nSau day la cac bo phim yeu thich cua ban: " + film);
                    System.out.println("Nhap vi tri va ten phim ban muon chinh sua(LUU Y: Nhap so truoc roi sau do den ten): ");
                    film.set(x = sc.nextInt(), nameFilm = sc.next());
                    System.out.println("Sau day la danh sach sau khi sua: " + film);
                    break;
                case 4:
                    System.out.println("Sau day la cac bo phim yeu thich cua ban: " + film);
                    System.out.println("\n Nhap ten bo phim muon xoa");
                    film.remove(nameFilm = sc.next());
                    System.out.println(" Sau day la danh sach sau khi sua: " + film);
                    break;
                case 5:
                    System.out.println("\n Nhap ten bo phim ban muon tim kiem: ");
                    nameFilm = sc.next();
                    System.out.println("Ten bo phim ban tim la: " + nameFilm.contains(nameFilm));
            }
        }while (m<0);
    }
}

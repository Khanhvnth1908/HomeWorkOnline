package Java2_02;

import java.util.ArrayList;

public class MovieList2 {
    private  ArrayList<String> movieList = new ArrayList<>();

    public static void main(String[] args) {
        MovieList2 list = new MovieList2();

//  Them bo phim yeu thich vao danh sach
        System.out.println("Sau đây là danh sách bộ phim yêu thích của bạn: ");
        System.out.println("-------------------------------------");
        list.addMovie("Titanic");
        list.addMovie("My heart is broken");
        list.addMovie("Chị chị em em");
        list.addMovie("Mắt Biếc");

        list.diplayList();

//   Xoa bo phim yeu thich khoi danh sach
        System.out.println("\nDanh sách mới của bạn sau khi xóa: ");
        list.removeMovie("Titanic");
        list.diplayList();

//   Chinh sua ten phim
        System.out.println("\nDanh sách mới sau chỉnh sửa: ");
        list.setMovieList(1, "Hello hello");
        list.diplayList();
//   Tim kiem ten phim
        System.out.print("\nTên bô phim ban muốn tìm: ");
        list.searchMoive("Mat biec");

//    Cap nhat phim
        System.out.println("\nDanh sách phim sau khi thêm: ");
        list.updateMovie(2,"Avenger: Endgame");
        list.diplayList();
    }

    public void addMovie(String movie){
        movieList.add(movie);
    }

    public void removeMovie(String nameMovie){
        movieList.remove(nameMovie);

    }

    public void setMovieList(int x,String nameMovie){
        movieList.set(x, nameMovie);

    }

    public void searchMoive(String nameMovie){
        System.out.println(movieList.contains(nameMovie));
    }

    public void updateMovie(int x,String nameMovie){
        movieList.add(x,nameMovie);
    }

    public void diplayList(){
        for (int i = 0;i < movieList.size();i++){
            System.out.println("Movie "+ (i+1) + " " + movieList.get(i));
        }
    }
}

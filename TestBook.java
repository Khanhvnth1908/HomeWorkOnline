/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jp_04;

/**
 *
 * @author User
 */
public class TestBook {
    public static void main(String[] args) {
        Author codelean = new Author("Vuong Ngoc Khanh", "khanhvuong210@gmail.com", 'm');
        System.out.println(codelean);
        
        Book b1 = new Book("Marvel comic ", codelean, 30000, 10);
        System.out.println(b1);
        System.out.println("Book name " + b1.getName());
        System.out.println("Price " + b1.getPrice());
        System.out.println("QTy " + b1.getQty());
        System.out.println("Authour " + b1.getAuthorName());
    }
}

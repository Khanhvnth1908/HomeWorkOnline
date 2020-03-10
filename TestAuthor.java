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
public class TestAuthor {
    public static void main(String[] args) {
         Author  a1 = new Author("Vuong Ngoc Khanh", "khanhvuong987@gmail.com", 'm');
         System.out.println(a1);
         a1.setEmail("khanhvuong201@gmail.com");
         System.out.println(a1);
         
         
    }
}

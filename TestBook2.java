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
public class TestBook2 {
    public static void main(String[] args) {       
          Author2[] result = new Author2[2];
          result[0] = new Author2("Yoo Yi Seo", "daill@gmail.com", 'm'); 
          result[1] = new Author2("Park saeroyi", "saeroyi@gmail.com", 'f');         
          
          Book2 javabook = new Book2("Javacode", result, 300000, 20);
          System.out.println(javabook);         
    }
}

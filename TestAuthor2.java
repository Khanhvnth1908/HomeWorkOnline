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
public class TestAuthor2 {
    public static void main(String[] args) {
        Author2 a1 = new Author2("Park Saeroyi", "ill@gmail.com", 'f');
        System.out.println("Authour name " + a1.getName());
        System.out.println("Author email " + a1.getEmail());
        System.out.println(a1.toString());
    }
}

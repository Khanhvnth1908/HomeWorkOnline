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
public class TestMyRectangle {
    public static void main(String[] args) {
        MyRectangle m1 = new MyRectangle(3, -4, 5, 7);
        System.out.println("Width " + m1.getWidth());
        System.out.println("Lenght " + m1.getLenght());
        System.out.println(m1);
        
        System.out.println(m1.Location());
    }
}

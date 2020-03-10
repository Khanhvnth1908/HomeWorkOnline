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
public class TestMyCircle {
    public static void main(String[] args) {
        MyCricle m1 = new MyCricle(new MyPoint2(3, 4), 7);  
         System.out.println("X= " + m1.getCenterX());
        System.out.println("Y= " + m1.getCenterY());
        System.out.println(m1);
        
               System.out.println();
               
        MyCricle m2 = new MyCricle(4, 1, 5);
        System.out.println("X= " + m2.getCenterX());
        System.out.println("Y= " + m2.getCenterY());
        System.out.println(m2);
        System.out.println("Distance of Cricle= " + m2.distance(m1));
    }
}

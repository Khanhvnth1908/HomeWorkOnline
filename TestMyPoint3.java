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
public class TestMyPoint3 {
    public static void main(String[] args) {
        MyPoint3 m1 = new MyPoint3(3, 4);
        m1.setX(1);
        m1.setY(8);
        System.out.println(m1.getX());
        System.out.println(m1.getY());
        System.out.println(m1);
    }
}

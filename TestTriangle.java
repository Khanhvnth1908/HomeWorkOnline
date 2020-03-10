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
public class TestTriangle {
    public static void main(String[] args) {
        MyTriangle m1 = new MyTriangle(3, 3, 3, 3, 3, 3);
        System.out.println(m1);
        System.out.println("Primeter= " + m1.getPrimeter());
        System.out.println("Type: " + m1.getType());
    }
}

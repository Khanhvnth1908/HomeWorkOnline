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
public class TestCustomer {
    public static void main(String[] args) {
        Customer c1 = new Customer(1, "Vuong Ngoc Khanh", 12);
        System.out.println("ID: " + c1.getId());;
        System.out.println("Name: " + c1.getName());
        System.out.println("Discount: " + 12);
        System.out.println(c1);
    }
}

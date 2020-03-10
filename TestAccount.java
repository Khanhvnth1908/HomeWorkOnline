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
public class TestAccount {
    public static void main(String[] args) {
        Account a1 = new Account(1, new Customer2(1, "Vuong Ngoc Khanh", 'f'), 10);
        System.out.println(a1.toString());
        System.out.println(a1.deposit(30));
        System.out.println(a1.withdraw(5));
    }
}

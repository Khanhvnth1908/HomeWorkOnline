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
public class TestInvoice {
    public static void main(String[] args) {
        Invoice i1 = new Invoice(1, new Customer(1, "vuong ngoc khanh", 30), 200000);
        System.out.println(i1);
        System.out.println(i1.amountAfterdiscount());
    }
}

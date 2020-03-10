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
public class Account {
    private int id;
    private Customer2 customer2;
    private double balance;

    public Account(int id, Customer2 customer2, double balance) {
        this.id = id;
        this.customer2 = customer2;
        this.balance = balance;
    }

    public Account(int id, Customer2 customer2) {
        this.id = id;
        this.customer2 = customer2;
    }

    public int getId() {
        return id;
    }

    public Customer2 getCustomer2() {
        return customer2;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return String.format("Account ={ " + customer2 + "}" + " Balance= %2f ", balance);
    }
    
    public String getCustomerName(){
        return customer2.getName();
    }
    
    public Account deposit(double amount){
       this.balance = this.balance + amount;     
        return this;
    }
    
    public Account withdraw(double amount){
        if(amount>balance){
            System.out.println("So tien trong tai khoan khong du");
        }else{
            
            this.balance-= amount;
            System.out.println("So tien con lai cua ban: " + balance);
        }
        return this;
    }
}

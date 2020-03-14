/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.Scanner;

/**
 *
 * @author User
 */
abstract public class SalaryPolicy {
    private float baseSalary;
    Scanner src = new Scanner(System.in);
   
    public SalaryPolicy(){
        
    }
    public SalaryPolicy(float baseSalary) {
        this.baseSalary = baseSalary;
    }

    public float getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary() {
        System.out.print("Nhap baseSalary: ");
        baseSalary = src.nextFloat();
    }

    @Override
    public String toString() {
        return "SalaryPolicy{" + "baseSalary=" + baseSalary + '}';
    }
    
    
    abstract public float getSalary();
}

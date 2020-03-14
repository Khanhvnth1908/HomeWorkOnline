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
public class EmployeeFullTime extends SalaryPolicy{
    private float rate;
    Scanner src = new Scanner(System.in);
    
    public EmployeeFullTime(){
        
    }
    
    public EmployeeFullTime(float rate, float baseSalary) {
        super(baseSalary);
        this.rate = rate;
    }

    public float getRate() {
        return rate;
    }


    public void setRate() {
        System.out.print("Nhap rate: ");
        rate = src.nextInt();
    }
    
    @Override
    public float getSalary(){
        return rate * super.getBaseSalary();
    }

    @Override
    public String toString() {
        return "EmployeeFullTime{" + super.toString() + "rate=" + rate + '}';
    }
    
}

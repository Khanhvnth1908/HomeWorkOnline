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
public class EmployeePartTime extends SalaryPolicy{
    private float rate;
    Scanner src = new Scanner(System.in);
    
    public EmployeePartTime(){
        
    }
    public EmployeePartTime(float rate, float baseSalary) {
        super(baseSalary);
        this.rate = rate;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }
    
    @Override
    public float getSalary(){
        return super.getBaseSalary() * rate;
    }
    
}

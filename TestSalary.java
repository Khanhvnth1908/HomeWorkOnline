/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author User
 */
public class TestSalary {
       public static void main(String[] args) {
           
        System.out.println("\n===EmployeeFullTime====");   
        EmployeeFullTime f1 = new EmployeeFullTime
        System.out.println("Salary of EmployeePartTime = " + f1.getSalary());
        
        
        System.out.println("\n===EmPloyeePartTime===");
        EmployeePartTime p1 = new EmployeePartTime();
        p1.setRate();
        p1.setBaseSalary();
        System.out.println("Salary of EmployeePartTime = " + p1.getSalary());
    }
}

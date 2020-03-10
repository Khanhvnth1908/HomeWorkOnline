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
public class Customer2 {
       private int id;
    private String name;
    private char gender;

    public Customer2(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

  

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Customer2{" +  name + "(" + id + ")" + ", gender=" + gender + '}';
    }
    
}

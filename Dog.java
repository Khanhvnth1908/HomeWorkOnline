/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_11;

/**
 *
 * @author User
 */
public class Dog extends Animals{
    @Override
    public void greeting(){
        System.out.println("Woof!");
    }
    
    public void greeting(Dog another){
        System.out.println("Wooooooooof!");
    }
}


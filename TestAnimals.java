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
public class TestAnimals {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.greeting();
        Dog dog1 = new Dog();
        dog1.greeting();
        BigDogs b = new BigDogs();
        b.greeting();
        
        System.out.println();
        
        Animals a1 = new Cat();
        a1.greeting();
        Animals a2 = new Dog();
        a2.greeting();
        Animals a3 = new BigDogs();
        a3.greeting();
        System.out.println();
        
        
        Dog dog2 = (Dog)a3;
        BigDogs b2 = (BigDogs)a3;
        Dog dog3 = (Dog)a2;
        Cat cat2 = (Cat)a1;
        dog2.greeting(dog3);    //wooooooooooww
        dog3.greeting(dog2);    //woooooooooof
        dog2.greeting(b2);      //woooooooooow
        b2.greeting(dog2);      //wooooooooooow
        b2.greeting(b);         //wooooooooooow
    }
}

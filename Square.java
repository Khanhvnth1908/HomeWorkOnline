/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_08;

import sun.security.util.Length;

/**
 *
 * @author User
 */
public class Square extends Rectangle {
    private double side;
    
    public Square(){
     
    }
    
    public Square(String color,boolean filled,double side){
        super(color, filled, side, side);
    }
    
    public void setSide(double side){
        
    }

    @Override
    public String toString() {
        return "Square{" + super.toString();
    }
      
    
    
    public static void main(String[] args) {
        Square s1 = new Square("green", true, 32);
        System.out.println(s1);
        s1.setWidth(35);
        System.out.println(s1);
    }
}

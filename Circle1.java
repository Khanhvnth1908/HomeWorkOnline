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
public class Circle1 extends Shape {
    private double radius;
    public Circle1(){
        radius = 1.0;
    }
    public Circle1(double radius){
        this.radius = radius;
    }
    public Circle1(double radius,String color, boolean filled){
        super(color,filled);
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    @Override
    public double getArea(){
        return radius * radius * Math.PI;
    }
    @Override
    public double getPerimeter(){
        return radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle[" +super.toString() + "," + radius + "]";
    }
    
    
    
}

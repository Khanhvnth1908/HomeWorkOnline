/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_08;

/**
 *
 * @author User
 */
public class Cylinder extends Circle{
    private double height;
    
    public Cylinder(){
        super();
        height = 6;
    }
    public Cylinder(double height){
        super();
        this.height = height;
    }
    public Cylinder(double height,double radius){
        super(radius);
        this.height = height;
    }
    public Cylinder(double height,double radius,String color){
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getvolume(){
        return getArea()*height;
    }

    @Override
    public String toString() {
            return "Cylinder " + "height= " + height + super.toString();
    }
    
    
    
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        System.out.println(c1);
        System.out.println("Volume = " + c1.getvolume());
        System.out.println();
        Cylinder c2 = new Cylinder(5, 2, "white");
        System.out.println(c2);
        System.out.println("volume " + c2.getvolume());
    }
}

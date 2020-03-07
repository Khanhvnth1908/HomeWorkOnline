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
public class Rectangle extends Shape {
    private double width;
    private double lenght;
    
    public Rectangle(){
        super();
        width = 5;
        lenght = 8;
    }
   public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }
   
    public Rectangle(String color, boolean filled,double width, double lenght) {
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getArea(){
        return width * lenght;
    }
    public double getPrimeter(){
        return (width + lenght) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{ " + super.toString() + " width= " + width + ", lenght= " + lenght + '}';
    }
    
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println(r1);
        System.out.println("Lenght= " + r1.getLenght() + " Color= " + r1.getColor() + " filled= " + r1.isFilled());
        System.out.println("Area= " + r1.getArea());
        System.out.println("Primeter= " + r1.getPrimeter());
    }
}

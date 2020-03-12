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
public class Square2 extends Rectangle{
    private double side;
    
    public Square2(){
        super();
        side = 1.0;
   
    }
    public Square2(double side){
        super();
        this.side = side;
    }
    public Square2(double side,String color,boolean filled){
        super.setColor(color);
        super.setFilled(filled);
        this.side = side;
    }
    public double getSide(){
       return side;
    }
    public void setSide(double side){
        this.side = side;
    }
    public void setWidth(double side){
        super.setWidth(side);
    }
    public void setLength(double side){
        super.setLength(side);
    }
    
    @Override
    public String toString() {
        return "Square[" + super.toString()+", "+ "width=" + super.getWidth() + ", length=" + super.getLength() +']';
    }
}
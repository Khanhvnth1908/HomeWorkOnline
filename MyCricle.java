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
public class MyCricle {
    private MyPoint2 center;
    private int radius;

    public MyCricle(int x,int y, int radius) {
        center = new MyPoint2(x, y);
        this.radius = radius;
    }

    public MyCricle(MyPoint2 center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public MyPoint2 getCenter() {
        return center;
    }

    public void setCenter(MyPoint2 center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    public int getCenterX(){
        return center.getX();
    } 
    
    public void setCenterX(int x){
        x = center.getX();
    }
    public int getCenterY(){
        return center.getY();
    }
    
    public void setCenterY(int y){
        y = center.getY();
    }

    @Override
    public String toString() {
        return "MyCricle{" + "center=" + center + ", radius=" + radius + '}';
    }

   
    public double Area(){
        return radius * radius * Math.PI * 2;
    }
    public double CIrcumference(){
         return radius * 2 * Math.PI;             
    }
    public double distance(MyCricle another){
        return Math.sqrt((another.getCenterX() - this.getCenterX())*(another.getCenterX() - this.getCenterX())+(another.getCenterY() - this.getCenterY())*(another.getCenterY() - this.getCenterY()));
    }  
}

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
public class MyPoint {
    private int x,y;
    
    public MyPoint(){
        x = 0;
        y = 0;
    }
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
     
    public int[] getXY(){
        int[] result = new int[2];
        result[0] = this.x;
        result[1] = this.y;
        return result;
    }
    public void setXY(int x,int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("("+"%d,%d"+")",x,y );
    }

    public double distance(int x,int y){
        return Math.sqrt((this.x - x)*(this.x - x) + (this.y - y)*(this.y - y));
    }
    
    public double distance(MyPoint another){
        return Math.sqrt((this.x - another.x)*(this.x - another.x) + (this.y - another.y)*(this.y - another.y));
    }
    public double distance(){
       return Math.sqrt((this.x)*(this.x) + (this.y)*(this.y));
    }
}

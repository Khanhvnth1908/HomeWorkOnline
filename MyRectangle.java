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
public class MyRectangle {

    private MyPoint4 v1;
    private float width;
    private float lenght;

    public MyRectangle(int x, int y, float width, float lenght) {
        v1 = new MyPoint4(x, y);
        this.width = width;
        this.lenght = lenght;
    }

    public MyRectangle(MyPoint4 v1, float width, float lenght) {
        this.v1 = v1;
        this.width = width;
        this.lenght = lenght;
    }
    
    public int getX(){
        return v1.getX();
    }
    public void setX(int x){
        x = v1.getX();
    }
    public int getY(){
        return v1.getY();
    }
    public void setY(int y){
        y = v1.getY();
    }
    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getLenght() {
        return lenght;
    }

    public void setLenght(float lenght) {
        this.lenght = lenght;
    }

    @Override
    public String toString() {
        return "MyRectangle{" + "v1=" + v1 + ", width=" + width + ", lenght=" + lenght + '}';
    }
    
    public String Location(){
        if(v1.getX()<0 && v1.getY()>0){
            System.out.println("Diem da cho nam tren cung ben trai");
        }
         if(v1.getX()>0&& v1.getY()<0){
                System.out.println("Diem da cho nam duoi cung ben phai");
            }
        return null;      
    }
    
}

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
public class MyTriangle {
    private MyPoint3 v1;
    private MyPoint3 v2;
    private MyPoint3 v3;
    
    public MyTriangle(int x1,int y1,int x2,int y2,int x3,int y3){
        v1 = new MyPoint3(x1, y1);
        v2 = new MyPoint3(x2, y2);
        v3 = new MyPoint3(x3, y3);
    }

    public MyTriangle(MyPoint3 v1, MyPoint3 v2, MyPoint3 v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle{" + "v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + '}';
    }
    
    public double getPrimeter(){
        double a = Math.sqrt(v2.getX() - v1.getX()*(v2.getX() - v1.getX()) + (v2.getY() - v1.getY()) * (v2.getY() - v1.getY()));
        double b = Math.sqrt(v2.getX() - v1.getX()*(v2.getX() - v1.getX()) + (v2.getY() - v1.getY()) * (v2.getY() - v1.getY()));
        double c = Math.sqrt(v2.getX() - v1.getX()*(v2.getX() - v1.getX()) + (v2.getY() - v1.getY()) * (v2.getY() - v1.getY()));
        return a + b + c;
    }
    
    public String getType(){
        double a = Math.sqrt(v2.getX() - v1.getX()*(v2.getX() - v1.getX()) + (v2.getY() - v1.getY()) * (v2.getY() - v1.getY()));
        double b = Math.sqrt(v2.getX() - v3.getX()*(v2.getX() - v3.getX()) + (v2.getY() - v3.getY()) * (v2.getY() - v3.getY()));
        double c = Math.sqrt(v3.getX() - v1.getX()*(v3.getX() - v1.getX()) + (v3.getY() - v1.getY()) * (v3.getY() - v1.getY()));
        if(a==b && a==c && b==c){
            System.out.println("Equilateral");
        }
           if(a==b || a==c || b==c){
                System.out.println("Icosceles");
             
            }
              if(a!=b || a!=c || b!=c){
                    System.out.println("Scalence");
                }
        return null;
    }
}

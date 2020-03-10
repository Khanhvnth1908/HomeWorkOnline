/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jp_04;

import sun.security.x509.CRLDistributionPointsExtension;

/**
 *
 * @author User
 */
public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint m1 = new MyPoint(2, 3);
        System.out.println(m1);
        //distance
        System.out.println("khoang cach giua 2 diem tren toa do = " + m1.distance(4, 7));
        //distance aother
        MyPoint m2 = new MyPoint(5, 2);        
        System.out.println("khoang cach tu diem ban dau den diem khac = " + m2.distance(m1));
        //distance (0,0);
        System.out.println("Khoang cach tu diem do den diem cos toa do(0:0)= " + m2.distance());
        
        System.out.println();
               
        MyPoint m3 = new MyPoint(2, 3);
        m3.setXY(5, 6);
        System.out.println(m3);
        System.out.println("X is " + m3.getXY()[0]);
        System.out.println("Y is " + m3.getXY()[1]);
        
        MyPoint[] points = new MyPoint[10];
        for (int i = 0; i < points.length; i++) {
            points[i] = new MyPoint(i, i);
                System.out.println(points[i]);
        }
    }
}

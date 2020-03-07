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
public class Point2D {
    float x;
    float y;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    public Point2D(){
        x = 0f;
        y = 0f;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    
    public void setXY(int x,int y){
    this.x = x;
    this.y = y;
    }

    public float[] getXY(){
        float[] result = new float[2];
        result[0] = this.x;
        result[1] = this.y;
        return result;
    }
    
    @Override
    public String toString() {
        return "(" + x + "," + y;
    }
    
}

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
public class MovablePoint extends Point2D{
    private float xSpeed;
    private float ySpeed;

    public MovablePoint(float x, float y,float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    
    public MovablePoint(){
        super();
        xSpeed = 60;
        ySpeed = 70;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    
        public float[] getSpeed(){
        float[] result = new float[2];
        result[0] = this.xSpeed;
        result[1] = this.ySpeed;
        return result;
    }
        
    public void setSpeed(float XSpeed,float YSpeed){
        this.xSpeed = XSpeed;
        this.ySpeed = YSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + ")" + "-" + "speed(" + xSpeed + "," + ySpeed + ")";
    }
    
    public MovablePoint move(){
        x+= xSpeed;
        y+= ySpeed;
        return this;
    }
    
    public static void main(String[] args) {
        MovablePoint m1 = new MovablePoint();
        System.out.println(m1);
        m1.setSpeed(33, 44);
        System.out.println(m1.getSpeed()[0]);
        System.out.println(m1.getSpeed()[1]);
        System.out.println();
        
        MovablePoint m2 = new MovablePoint(23, 55);
        System.out.println(m2);
        m2.setSpeed(34, 57);
        System.out.println("X= " + m2.getSpeed()[0]);
        System.out.println("Y= " + m2.getSpeed()[1]);
        System.out.println();
        
        MovablePoint m3 = new MovablePoint(3, 5, 80, 120);
        System.out.println(m3);
        m3.setSpeed(100, 240);
        System.out.println("X= " + m3.getSpeed()[0]);
        System.out.println("Y= " + m3.getSpeed()[1]);
        System.out.println("Move= " + m3.move());
    }
}

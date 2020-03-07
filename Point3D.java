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
public class Point3D extends Point2D{
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
        super();
        z = 0;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    
    public float[] getXYZ(){
    float[] result = new float[3];
    result[0] = this.x;
    result[1] = this.y;
    result[2] = this.z;
    return result;
    }
        
    public void setXYZ(float x,float y,float z){
        this.x = x;        //cai ban dau bang cai moi
        this.y = y;                  // neu viet theo kieu "x = this.x" thi se hieu theo "cai moi bang voi cai ban dau"
        this.z = z;                  //nen gia tri se khong doi so voi ban dau        
    }

    @Override
    public String toString() {
        return super.toString() + "," + z + ")";
    }
    
    public static void main(String[] args) {
        Point3D p1 = new Point3D();
        System.out.println(p1);
        
        Point3D p2 = new Point3D(5,8,1);
        System.out.println(p2);
        p2.setXYZ(1, 2, 8);
        System.out.println("X= " + p2.getXYZ()[0]);
        System.out.println("Y= " + p2.getXYZ()[1]);
        System.out.println("Z= " + p2.getXYZ()[2]);
        
    }
}

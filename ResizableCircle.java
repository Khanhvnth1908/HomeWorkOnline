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
public class ResizableCircle extends Circle2 implements Resizable {
    public ResizableCircle(double radius){
        super(radius);
    }

    @Override
    public String toString() {
        return "ResizableCircle{" + '}';
    }
    
    @Override
    public double resize(int percent){
       radius *= percent / 100.0 ;
       return radius;
    }
    
}
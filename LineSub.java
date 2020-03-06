/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_07;

/**
 *
 * @author User
 */
public class LineSub extends Point{
        private Point end;
        
        public LineSub(int x1,int y1,int x2,int y2){
            super(x1, y1);
            this.end = new Point(x2, y2);
        }
}

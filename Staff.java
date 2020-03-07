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
public class Staff extends PerSon {
    private String school;
    private double pay;

    public Staff(String school, double pay, String name, String address) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff{" + super.toString() + " school=" + school + ", pay=" + pay + '}';
    }
    
    public static void main(String[] args) {
        Staff s1 = new Staff("FPT APtech", 650, "Vuong Ngoc Khanh", "thai binh");
        System.out.println(s1);
    }
}

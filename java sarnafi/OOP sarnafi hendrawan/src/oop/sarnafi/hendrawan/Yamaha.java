
package oop.sarnafi.hendrawan;
public class Yamaha {
    public static void main(String[] args) {
       SepedaMotor motor = new SepedaMotor();
       motor.inputMerek ("Yamaha");
       System.out.println("Merek motor ini adalah "+ motor.tampilMerek());
    }
    
}

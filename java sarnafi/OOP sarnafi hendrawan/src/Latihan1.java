import javax.swing.*;
public class Latihan1 {
    public static void main(String[] args) {
        String input1;
        String input2;

        int nilai1;
        int nilai2;

        int tambah;

        input1 = JOptionPane.showInputDialog("Masukkan nilai pertama:");
        input2 = JOptionPane.showInputDialog("Masukkan nilai kedua:");

        nilai1 = Integer.parseInt(input1);
        nilai2 = Integer.parseInt(input2);

        tambah = nilai1 + nilai2;

        JOptionPane.showMessageDialog(null,""+nilai1+" + "+ nilai2+" = " +tambah);

    }

}
   

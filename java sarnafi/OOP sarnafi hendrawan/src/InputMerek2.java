import javax.swing.*;
public class InputMerek2 {
    public static void main(String[] args) {
        String input;
        input = JOptionPane.showInputDialog("masukan Harga : ");
        long harga = Integer.valueOf(input).intValue();
        JOptionPane.showMessageDialog(null, harga);
    }
    
}

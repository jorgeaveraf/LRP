import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Año año = new Año();
        int i = Integer.parseInt(JOptionPane.showInputDialog("ingresa un año"));
        año.calculo(i);

    }
}
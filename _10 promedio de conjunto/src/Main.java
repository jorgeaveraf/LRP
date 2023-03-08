import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int n = 0;
        for (int i = 1; i <= 5; i++) {
            n += Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));

        }
        int p = n / 5;
        JOptionPane.showMessageDialog(null, "El promedio es " + p);
    }
}
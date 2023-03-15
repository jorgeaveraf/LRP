import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Nota c1 = new Nota();
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        c1.Letra(n1);
    }
}
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int n=1;
        int j=Integer.parseInt(JOptionPane.showInputDialog("¿Digite un número?"));
        for (int i = 1; i<=j; i++){
        n=n*i;
    }
        JOptionPane.showMessageDialog(null,"El factorial de "+j+" es igual a "+n);
    }
}
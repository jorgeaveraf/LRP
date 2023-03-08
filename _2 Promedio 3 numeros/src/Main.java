import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));

        Promedio num = new Promedio();
        num.prom(num1,num2,num3);
    }
}
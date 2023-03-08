import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Cuál es el número 1?"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Cuál es el número 2?"));
        Números num = new Números();
        num.sumar(num1,num2);

    }
}
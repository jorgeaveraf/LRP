import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        double num = Double.parseDouble(JOptionPane.showInputDialog("Digite el radio del círculo"));

        area area= new area();
        area.calculo(num);

    }
}
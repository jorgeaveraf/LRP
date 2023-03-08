import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        double celsius = Double.parseDouble(JOptionPane.showInputDialog("Introduce la temperatura en Celsius"));

        Conversion conversion = new Conversion();
        conversion.convertir(celsius);

    }
}
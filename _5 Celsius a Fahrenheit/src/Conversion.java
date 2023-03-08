import javax.swing.*;

public class Conversion {
    public void convertir(double num){
        double conversion = (num*1.8) + 32;
        JOptionPane.showMessageDialog(null,"La conversión de grados Celsius a Fahrenheit es "+conversion);

    }
}

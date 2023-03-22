import javax.swing.*;

public class Año {

    public void calculo(int i) {
        if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
            JOptionPane.showMessageDialog(null, "El año " + i + " es bisiesto");
        } else {
            JOptionPane.showMessageDialog(null, "El año " + i + " no es bisiesto");
        }
    }
}

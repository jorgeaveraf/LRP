import javax.swing.*;

public class conversor {
    Object[] medidas = {"MM", "CM", "M"};

    public void conversor() {
        int input = JOptionPane.showOptionDialog(null, "Seleccione la unidad de medida inicial", "Título del cuadro de diálogo", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, medidas, medidas[0]);
        int output = JOptionPane.showOptionDialog(null, "Seleccione la unidad de medida a convertir", "Título del cuadro de diálogo", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, medidas, medidas[0]);
        double num = Double.parseDouble(JOptionPane.showInputDialog("Digite una cantidad"));
        switch (input) {
            case 0:
                switch (output) {
                    case 0:
                        JOptionPane.showMessageDialog(null, num);
                        break;
                    case 1:
                        JOptionPane.showMessageDialog(null, num / 10);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, num / 1000);
                        break;
                }
                break;
            case 1:
                switch (output) {
                    case 0:
                        JOptionPane.showMessageDialog(null, num * 10);
                        break;
                    case 1:
                        JOptionPane.showMessageDialog(null, num);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, num/100);
                        break;
                }
                break;
            case 2:
                switch (output) {
                    case 0:
                        JOptionPane.showMessageDialog(null, num * 1000);
                        break;
                    case 1:
                        JOptionPane.showMessageDialog(null, num * 100);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, num);
                        break;
                }
                break;
        }
    }
}

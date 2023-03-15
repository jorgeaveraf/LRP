import javax.swing.*;

public class Nota {
    public int num;

    public void Letra(int num) {
        switch (num) {
            case 10:
                JOptionPane.showMessageDialog(null, "A");
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "B");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "C");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "D");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "E");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "F");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Número no válido");
        }
    }
}


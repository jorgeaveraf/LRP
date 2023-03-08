import javax.swing.*;

public class area {
    public void calculo(double num){
        double area = Math.pow(num,2)*3.1416;
        JOptionPane.showMessageDialog(null,"El área del círculo es "+area);
    }
}

import javax.swing.*;

public class Promedio {
    //promedio
    public void prom(int num1, int num2, int num3){
        int promedio = (num1+num2+num3)/3;
        JOptionPane.showMessageDialog(null,"El promedio de los números es "+promedio);
    }
}

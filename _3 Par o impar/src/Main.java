import javax.swing.*;

public class Main {
    public static void main(String[] args) {
int num = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
PoI poi = new PoI();
poi.poi(num);

    }
}
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Generador gen = new Generador();
        int i = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la extensión de la contraseña"));
        gen.Creador(i);

    }
}
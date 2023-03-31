import javax.swing.*;
import java.util.Random;
import java.util.random.RandomGenerator;

public class Generador {
    private String Letras_Min[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l","A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L",",", "!", "'", "#", "$", "%", "&", "/", "(", ")", "=", "?","1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};


    public void Creador(int j) {
        String contrasena = "";
        for (int i = 0; i < j; i++) {
            Random ran = new Random();
            contrasena += Letras_Min[ran.nextInt(46)];
        }
        JOptionPane.showMessageDialog(null,"La contraseña es: "+contrasena);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double numero;
        double b;
        do {
            System.out.println("Ingresa un numero entero positivo:");
            numero = in.nextDouble();
            b = numero * numero;
        } while (numero < 0 || Math.sqrt(b) % 1 != 0);

        String numeros = Integer.toString((int) numero);
        System.out.println("la extensión del número es de "+numeros.length());
    }
}

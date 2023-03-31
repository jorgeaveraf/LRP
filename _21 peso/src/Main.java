import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa tu peso en KG");
        double peso = in.nextDouble();
        System.out.println("Ingresa tu estatura en M");
        double estatura = in.nextDouble();
        double IMC = peso / (estatura * estatura);
        System.out.println("Tu indice de masa corporal es de:" + IMC);
        if (IMC < 18.5) {
            System.out.println("Bajo peso");
        } else if (IMC >= 18.5 && IMC <= 24.9) {
            System.out.println("Peso Normal");
        } else if (IMC >= 25.0 && IMC <= 29.9) {
            System.out.println("Sobrepeso");
        } else if (IMC >= 30.0 && IMC <= 34.9) {
            System.out.println("Obesidad I");
        } else if (IMC >= 35.0 && IMC <= 39.9) {
            System.out.println("Obesidad II");
        } else if (IMC >= 40.0) {
            System.out.println("Obesidad III");
        }
    }
}
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int var [] = new int[5];
        Random rand = new Random();
        for (int i=0; i<var.length;i++){
            var[i]=rand.nextInt(101);
            System.out.println(var[i]);
        }
    }
}
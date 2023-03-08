public class Main {
    public static void main(String[] args) {
        int n=0;
        for (int i=1; i<=15; i++){
            if (i%2 != 0){
                n+=i;
            }
        }
        System.out.println("La suma de números impares es "+n);
    }
}
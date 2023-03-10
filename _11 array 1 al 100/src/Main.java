public class Main {
    public static void main(String[] args) {
        int var[] = new int[100];
        int sum = 0;
        for (int i = 0; i < var.length; i++) {
            var[i] = i + 1;
            sum+=(var[i]);
        }
        System.out.println(sum);
        int media=sum/ var.length;
        System.out.println(media);
    }
}
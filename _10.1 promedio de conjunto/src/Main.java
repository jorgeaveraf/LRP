public class Main {
    public static void main(String[] args) {
        int[] var = {5,8,3,2,9};
        int s = 0;
        for (int i : var) {
            s += i;
        }
        int p = s / var.length;
        System.out.println(p);
    }
}
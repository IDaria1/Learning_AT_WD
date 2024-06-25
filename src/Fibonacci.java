public class Fibonacci {
    public static void main(String[] args) {
        int n = 1;
        int k = 1;
        int g;
        System.out.print(n + " " + k + " ");
        for (int i = 3; i <= 11; i++) {
            g = n + k;
            System.out.print(g + " ");
            n = k;
            k = g;
        }
        System.out.println();
    }
}
import java.util.Scanner;
public class P2162A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long t = scanner.nextLong();
        while (t-- > 0) {
            long n = scanner.nextLong();
            long mx = 0;
            while (n-- > 0) {
                long x = scanner.nextLong();
                mx = Math.max(mx, x);
            }
            System.out.println(mx);
        }

        scanner.close();
    }
}


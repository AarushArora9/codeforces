import java.util.Scanner;

public class P2119A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextLong()) {
            return;
        }
        long t = scanner.nextLong();
        while (t-- > 0) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long x = scanner.nextLong();
            long y = scanner.nextLong();
            
            if (a > b) {
                System.out.println(((a ^ 1) == b) ? y : -1);
            } else {
                long c0 = b - a;
                long c1 = (b + 1) / 2 - (a + 1) / 2;
                long result = (y > x) ? (c0 * x) : ((c0 - c1) * x + c1 * y);
                System.out.println(result);
            }
        }
        scanner.close();
    }
}

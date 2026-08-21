import java.util.Scanner;
 
public class P1915C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextLong()) {
            return;
        }
        long t = scanner.nextLong();
        while (t-- > 0) {
            long n = scanner.nextLong();
            long cs = 0;
            for (long p = 0; p < n; p++) {
                long x = scanner.nextLong();
                cs += x;
            }
            long chk = (long) Math.sqrt(cs);
            if (chk * chk < cs) {
                ++chk;
            } else if (chk * chk > cs) {
                --chk;
            }
            if (chk * chk == cs) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }
}

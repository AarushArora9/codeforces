import java.util.Scanner;

public class P2000B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long t = sc.nextLong();
        while (t-- > 0) {
            long n = sc.nextLong();
            long x = sc.nextLong();
            long left = x - 1, right = x + 1;
            boolean rule = true;

            for (long p = 1; p < n; p++) {
                x = sc.nextLong();
                if (x == left) {
                    --left;
                } else if (x == right) {
                    ++right;
                } else {
                    rule = false;
                }
            }

            System.out.println(rule ? "YES" : "NO");
        }

        sc.close();
    }
}

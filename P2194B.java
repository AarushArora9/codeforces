import java.util.Scanner;

public class P2194B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long t = sc.nextLong();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            long v[] = new long[n];
            long moved = 0;
            for (int p = 0; p < n; p++) {
                v[p] = sc.nextLong();
                moved += y * (v[p] / x);
            }

            long mxm = 0;
            for (long a : v) {
                long cur = a + moved - y * (a / x);
                if (cur > mxm) {
                    mxm = cur;
                }
            }

            System.out.println(mxm);
        }

        sc.close();
    }
}

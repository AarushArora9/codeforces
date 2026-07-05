import java.util.*;

public class P2143B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long t = sc.nextLong();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            Long[] a = new Long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            int[] b = new int[k];
            for (int i = 0; i < k; i++) {
                b[i] = sc.nextInt();
            }

            Arrays.sort(a, Collections.reverseOrder());
            Arrays.sort(b);

            int idx = -1;
            for (int p = 0; p < k; p++) {
                if (idx + b[p] >= n) {
                    break;
                }
                idx += b[p];
                a[idx] = 0L;
            }

            long cost = 0;
            for (long x : a) {
                cost += x;
            }

            System.out.println(cost);
        }

        sc.close();
    }
}

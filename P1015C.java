import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();
        long sa = 0, td = 0;
        long[] d = new long[(int) n];

        for (int p = 0; p < n; p++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            sa += a;
            td += (a - b);
            d[p] = a - b;
        }

        if (sa <= m) {
            System.out.println(0);
            return;
        } else if (m < sa - td) {
            System.out.println(-1);
            return;
        } else {
            Arrays.sort(d);
            // reverse the array to simulate sort in descending order
            for (int i = 0; i < n / 2; i++) {
                long temp = d[i];
                d[i] = d[(int) n - 1 - i];
                d[(int) n - 1 - i] = temp;
            }

            int cnt = 0;
            for (int p = 0; p < n; p++) {
                sa -= d[p];
                if (sa <= m) {
                    cnt = p + 1;
                    break;
                }
            }

            System.out.println(cnt);
        }
    }
}


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P2232A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long t = sc.nextLong();
        while (t-- > 0) {
            long n = sc.nextLong();
            Map<Long, Long> m = new TreeMap<>();
            for (long p = 0; p < n; p++) {
                long x = sc.nextLong();
                m.put(x, m.getOrDefault(x, 0L) + 1);
            }
            long prev = 0, mnc = n + 1;
            for (Map.Entry<Long, Long> entry : m.entrySet()) {
                long num = entry.getKey();
                long cnt = entry.getValue();
                long rem = n - cnt - prev;
                long tst = Math.max(rem, prev);
                mnc = Math.min(mnc, tst);
                prev += cnt;
            }

            System.out.println(mnc);
        }

        sc.close();
    }
}

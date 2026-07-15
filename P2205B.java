import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            long n = Long.parseLong(br.readLine());
            long x = n;
            long ans = 1;

            for (long p = 2; p * p <= x; p++) {
                if (x % p == 0) {
                    ans *= p;
                    while (x % p == 0) {
                        x /= p;
                    }
                }
            }

            if (x > 1) {
                ans *= x;
            }

            out.append(ans).append('\n');
        }

        System.out.print(out);
    }
}

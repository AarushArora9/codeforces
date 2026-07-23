import java.util.Scanner;
public class P1011A {
    public static void main(String[] args) {
        final int N = 26;
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();
        boolean[] a = new boolean[N];
        String s = scanner.next();
        for (int p = 0; p < s.length(); p++) {
            a[s.charAt(p) - 'a'] = true;
        }
        long w = 0;
        long[] b = new long[N];
        for (int p = 0; p < N; p++) {
            if (!a[p]) continue;
            if (p > 0 && b[p - 1] != 0) continue;
            b[p] = 1;
            w += p + 1;
            k--;
            if (k <= 0) break;
        }

        System.out.println(k == 0 ? w : -1);
        scanner.close();
    }
}

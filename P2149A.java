import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long t = sc.nextLong();
        while (t-- > 0) {
            long n = sc.nextLong();
            long z = 0, neg = 0;
            for (long p = 0; p < n; p++) {
                long x = sc.nextLong();
                if (x == 0) z++;
                if (x < 0) neg++;
            }

            System.out.println(z + 2 * (neg % 2));
        }

        sc.close();
    }
}

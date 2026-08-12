import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextLong()) {
            return;
        }
        long n = scanner.nextLong();
        long x = scanner.nextLong();

        Set<Long> sa = new HashSet<>();
        Set<Long> sx = new HashSet<>();
        int num = 3;

        for (long p = 0; p < n; p++) {
            long a = scanner.nextLong();
            if (sa.contains(a)) {
                num = 0;
                break;
            }
            if (sx.contains(a)) {
                num = 1;
            } else if (sa.contains(a & x)) {
                num = 1;
            } else if (sx.contains(a & x)) {
                num = (num < 2) ? num : 2;
            }
            sa.add(a);
            sx.add(a & x);
        }

        if (num > 2) {
            System.out.println("-1");
        } else {
            System.out.println(num);
        }
    }
}


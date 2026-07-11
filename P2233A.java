import java.util.Scanner;
public class P2233A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            long n = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();
            long z = sc.nextLong();
            long scenario1 = (long) Math.ceil((double) n / (x + y));
            long linesFromMaximDuringSetup = x * z;
            long remainingLines = Math.max(0, n - linesFromMaximDuringSetup);
            long scenario2 = z + (long) Math.ceil((double) remainingLines / (x + 10 * y));
             System.out.println(Math.min(scenario1, scenario2));
        }
    }
}

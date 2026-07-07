import java.util.Scanner;
public class P2093C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            long x = sc.nextLong();
            long k = sc.nextLong();
            if (x == 1) {
                System.out.println(k == 2 ? "Yes" : "No");
                continue;
            } else if (k > 1) {
                System.out.println("No");
                continue;
            }
            boolean ans = true;
            for (long p = 2; p * p <= x; p++) {
                if (x % p == 0) {
                    ans = false;
                    break;
                }
            }
            System.out.println(ans ? "Yes" : "No");
        }
        sc.close();
    }
}

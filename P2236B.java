import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            String s = scanner.next();

            boolean possible = true;
            for (int f = 0; possible && f < k; f++) {
                boolean carry = false;
                for (int u = f; u < s.length(); u += k) {
                    if (s.charAt(u) == '1') {
                        carry = !carry;
                    }
                }
                if (carry) {
                    possible = false;
                }
            }

            System.out.println(possible ? "YES" : "NO");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class P1140B{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long t = scanner.nextLong();
        while (t-- > 0) {
            long n = scanner.nextLong();
            String s = scanner.next();

            long mn = s.length(), rem = 0;
            for (int p = 0; p < s.length(); p++) {
                if (s.charAt(p) == '<') {
                    ++rem;
                } else {
                    break;
                }
            }
            mn = Math.min(mn, rem);
            rem = 0;
            for (int p = s.length() - 1; p >= 0; p--) {
                if (s.charAt(p) == '>') {
                    ++rem;
                } else {
                    break;
                }
            }
            mn = Math.min(mn, rem);
            System.out.println(mn);
        }

        scanner.close();
    }
}

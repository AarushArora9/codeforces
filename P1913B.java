import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            String s = sc.next();
            long z = 0, a = 0;
            for (int p = 0; p < s.length(); p++) {
                if (s.charAt(p) == '0') z++;
                else if (s.charAt(p) == '1') a++;
            }

            long ans = 0;
            for (int p = 0; ans == 0 && p < s.length(); p++) {
                if (s.charAt(p) == '1') {
                    if (z > 0) {
                        z--;
                    } else {
                        ans = s.length() - p;
                        break;
                    }
                } else if (s.charAt(p) == '0') {
                    if (a > 0) {
                        a--;
                    } else {
                        ans = s.length() - p;
                        break;
                    }
                }
            }

            System.out.println(ans);
        }
        sc.close();
    }
}

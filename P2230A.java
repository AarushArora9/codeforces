import java.util.Scanner;
public class P2230A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            long n = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();
            long ans = 0;
            if (b <= a) 
                ans = b * ((n + 2) / 3);
            else if (b <= 2 * a) 
                ans = b * (n / 3) + a * (n % 3 == 1 ? 1 : 0) + b * (n % 3 == 2 ? 1 : 0);
            else if (b <= 3 * a)
                ans = b * (n / 3) + a * (n % 3);
            else 
                ans = n * a;
            System.out.println(ans);        }

        sc.close();
    }
}

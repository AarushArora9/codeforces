import java.util.Scanner;
public class P1041B {
    public static long gcd(long a, long b) {
        return (b == 0) ? a : gcd(b, a % b);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        if (scanner.hasNextLong()) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long x = scanner.nextLong();
            long y = scanner.nextLong();            
            long g = gcd(x, y);
            x /= g;
            y /= g;            
            long da = a / x;
            long db = b / y;
            long res = (da < db) ? da : db;            
            System.out.println(res);
        }        
        scanner.close();
    }
}

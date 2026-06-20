import java.util.Scanner;
 
public class P2227A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        long t = scanner.nextLong();
        while (t-- > 0) {
            long n = scanner.nextLong();
            long m = scanner.nextLong();
            long a=n%2+m%2;
            System.out.println((a==1 || a==0)?"yes":"no");
        }
    }
}

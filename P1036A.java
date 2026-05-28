import java.util.Scanner;

public class P1036A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();
        System.out.println((k + n - 1) / n);
        scanner.close();
    }
}

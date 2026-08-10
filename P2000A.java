import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextLong()) return;
        long t = scanner.nextLong();
        while (t-- > 0) {
            String x = scanner.next();
            boolean res = (x.length() > 2) && (x.charAt(0) == '1') && (x.charAt(1) == '0') && (x.charAt(2) != '0') && (!x.equals("101"));
            System.out.println(res ? "YES" : "NO");
        }
        scanner.close();
    }
}


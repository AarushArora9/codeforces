import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextLong()) {
            return;
        }
        long n = scanner.nextLong();
        long L = scanner.nextLong();
        long a = scanner.nextLong();
        
        long cur = 0;
        long cnt = 0;
        
        for (int i = 0; i < n; i++) {
            long t = scanner.nextLong();
            long l = scanner.nextLong();
            cnt += (t - cur) / a;
            cur = t + l;
        }

        cnt += (L - cur) / a;

        System.out.println(cnt);
    }
}


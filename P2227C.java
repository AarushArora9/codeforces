import java.util.ArrayList;
import java.util.Scanner;

public class P2227C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long t = sc.nextLong();
        while (t-- > 0) {
            long n = sc.nextLong();
            ArrayList<Long> va = new ArrayList<>();
            ArrayList<Long> vb = new ArrayList<>();
            ArrayList<Long> vc = new ArrayList<>();
            ArrayList<Long> vd = new ArrayList<>();

            for (long p = 0; p < n; p++) {
                long x = sc.nextLong();
                if (x % 6 == 0) {
                    va.add(x);
                } else if (x % 3 == 0) {
                    vb.add(x);
                } else if (x % 2 == 0) {
                    vc.add(x);
                } else {
                    vd.add(x);
                }
            }

            for (long x : va) {
                System.out.print(x + " ");
            }
            for (long x : vb) {
                System.out.print(x + " ");
            }
            for (long x : vd) {
                System.out.print(x + " ");
            }
            for (long x : vc) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

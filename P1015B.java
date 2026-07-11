import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P1015B {
    public static void main(String[] args) {
        final int N = 26;

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        String t = scanner.next();

        int[] v = new int[N];
        for (int p = 0; p < s.length(); p++) {
            v[s.charAt(p) - 'a']++;
        }
        for (int p = 0; p < t.length(); p++) {
            v[t.charAt(p) - 'a']--;
        }
        for (int p = 0; p < N; p++) {
            if (v[p] != 0) {
                System.out.println("-1");
                scanner.close();
                return;
            }
        }

        List<Integer> m = new ArrayList<>();
        char[] sArr = s.toCharArray();
        for (int p = 0; p < n; p++) {
            if (sArr[p] == t.charAt(p)) {
                continue;
            }
            int ind = p + 1;
            while (sArr[ind] != t.charAt(p)) {
                ind++;
            }
            for (int q = ind; q > p; q--) {
                char x = sArr[q];
                sArr[q] = sArr[q - 1];
                sArr[q - 1] = x;
                m.add(q);
            }
        }

        System.out.println(m.size());
        for (int pos : m) {
            System.out.print(pos + " ");
        }
        System.out.println();

        scanner.close();
    }
}

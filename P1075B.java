import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextLong()) return;
        
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        
        long[] x = new long[(int)(n + m)];
        for (int p = 0; p < n + m; p++) {
            x[p] = scanner.nextLong();
        }
        
        ArrayList<Long> d = new ArrayList<>();
        ArrayList<Long> r = new ArrayList<>();
        long[] cnt = new long[(int)m];
        
        for (int p = 0; p < m + n; p++) {
            int y = scanner.nextInt();
            if (y != 0) {
                d.add(x[p]);
            } else {
                r.add(x[p]);
            }
        }
        
        Collections.sort(r);
        Collections.sort(d);
        
        int idx = 0;
        for (int p = 0; p < n; p++) {
            if (r.get(p) < d.get(0)) {
                cnt[0]++;
            } else if (r.get(p) > d.get(d.size() - 1)) {
                cnt[cnt.length - 1]++;
            } else {
                while (idx + 1 < d.size() && r.get(p) > d.get(idx)) {
                    idx++;
                }
                if (r.get(p) - d.get(idx - 1) <= d.get(idx) - r.get(p)) {
                    cnt[idx - 1]++;
                } else {
                    cnt[idx]++;
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int p = 0; p < m; p++) {
            sb.append(cnt[p]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}

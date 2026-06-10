import java.util.Scanner;
public class P1354B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int n = s.length();
            int minLen = n + 1;
            int[] counts = new int[4]; 
            int distinct = 0;
            int left = 0;
            for (int right = 0; right < n; ++right)
            {
                int digit = s.charAt(right) - '0';
                if (counts[digit] == 0)
                    distinct++;
                counts[digit]++;
                while (distinct == 3) {
                    minLen = Math.min(minLen, right - left + 1);
                    int leftDigit = s.charAt(left) - '0';
                    counts[leftDigit]--;
                    if (counts[leftDigit] == 0) {
                        distinct--;
                    }
                    left++;
                }
            }
                if (minLen > n) 
                System.out.println(0);
             else 
                System.out.println(minLen);
        
        }
    }}

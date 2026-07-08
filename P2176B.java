import java.util.Scanner;
public class P2176B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            int x = sc.nextInt();
            String s = sc.next();
            long maxcnt=0,cnt=0;
            for(int p=0;p<2*x;p++)
            {
                char d=s.charAt((int)p%x);
                if(d=='0')
                ++cnt;
                else
                cnt=0;
                maxcnt=Math.max(cnt,maxcnt);
            }
            System.out.println(maxcnt);
        }
    }
}

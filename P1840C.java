import java.util.Scanner;
public class P1840C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long q = sc.nextLong();
            long cnt=0,res=0;
            for(long i=0;i<n;i++)
            {
                long x = sc.nextLong();
                if(x<=q)
                ++cnt;
                else cnt=0;
                res+=(cnt>=k)?(cnt-k+1):0;
            }
            System.out.println(res);
        }
    }
}

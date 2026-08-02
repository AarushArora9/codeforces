import java.util.Scanner;
public class P2203B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long a=sc.nextLong();
            long cnt=0,ds=0;
            long v[]=new long[10];
            while(a>0)
            {
                long r=a%10;
                ds=ds+r;
                ++v[(int)(r - ((a==r)?1:0))];
                a/=10;
            }
            int i=9;
            while(i>0 && ds>9)
            {
                if(v[i]>0)
                {
                    --v[i];
                    ds-=i;
                    ++cnt;
                }
                else
                i--;
            }
            System.out.println(cnt);
        }
    }
}

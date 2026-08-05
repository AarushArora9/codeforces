import java.util.Scanner;
public class P2250B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long n=sc.nextLong();
            long k=sc.nextLong();
            if(n==1)
            {
                System.out.println("0");
                continue;
            }
            if(k==n-1)
            {
                System.out.println("-1");
                continue;
            }
            k=n-k;
            String ans="";
            long z=(n+1)/2,a=n/2;
            for(long p=1;p<=k;p++)
            {
                if((p&1)==1)
                {
                    if(k < p + 2){while(z-->0){ans+=0;}}
                    else{--z; ans+=0;}
                }
                else{
                if(k < p + 2){while(a-->0){ans+=1;}}
                else{--a;ans+=1;}
                }
            }
            System.out.println(ans);
        }
    }
}

import java.util.Scanner;
public class P2234B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t=sc.nextLong();
        while(t-->0){
        long n= sc.nextLong(),a=-1,b=-1;
        for(int i=0;i<=n;i++)
        {
            if(isPal(i) && (n-i)%12==0)
            {a=i;b=n-i;break;}
        }
        if(a==-1 && b==-1)
        System.out.println(-1);
        else
        System.out.println(a+" "+b);
        }
    }
    private static boolean isPal(int n)
    {
        int c=n,rev=0;
        while(n>0)
        {
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        return rev==c;
    }
}

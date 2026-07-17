import java.util.Scanner;
public class P2229B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            int n=sc.nextInt();
            long a[]=new long[(int)n];
            long b[]=new long[(int)n];
            long c[]=new long[(int)2*n];
            for(int i=0;i<n;i++)
            a[i]=sc.nextLong();
            for(int i=0;i<n;i++)
            b[i]=sc.nextLong();
            long max=Integer.MIN_VALUE,sum=0;
            for(int i=0;i<n;i++){
            if(a[i]>b[i])
            {
                long temp=a[i];
                a[i]=b[i];
                b[i]=temp;
            }
            max=Math.max(a[i],max);
            sum+=b[i];
            }
            System.out.println(sum+max);
        }
    }
}

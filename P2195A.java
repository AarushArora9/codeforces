import java.util.Scanner;
public class P2195A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            long n = sc.nextLong();
            boolean v67=false;
            for(int i=0;i<n;i++)
            {
                int a=sc.nextInt();
                
                if(a==67)
                v67=true;
            }
            System.out.println(v67?"YES":"NO");
        }
        sc.close();
    }
}

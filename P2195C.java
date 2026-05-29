import java.util.Scanner;
public class P2195C{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int prev=sc.nextInt();
            int c=0;
            boolean chg=false;
            for(int i=1;i<n;i++)
            {
                int x=sc.nextInt();
                if(!chg && (x+prev==7 || x==prev))
                {
                    c++; chg=true;
                }
                else chg=false;
                prev=x;
            }
            System.out.println(c);
        }
    }
}

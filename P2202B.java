import java.util.Scanner;
public class P2202B{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            String s=sc.next();
            boolean possible=(n%2==0)||s.charAt(0)=='a'||s.charAt(0)=='?';
            if(n%2==0 && possible)
            {
            for(int i=1;i<n && possible;i+=2)
            {
                if(s.charAt(i)==s.charAt(i-1))
                possible = false;
            }
            }
            if(n%2==1 && possible)
            {
            for(int i=1;2*i<n && possible;i++)
            {
                if(s.charAt(2*i)==s.charAt(2*i-1))
                possible = false;
            }
            }
            System.out.println(possible?"yes":"no");
            //int prev=sc.nextInt();
        }
    }
}

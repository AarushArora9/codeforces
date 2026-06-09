import java.util.Scanner;
public class P2202B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int l=sc.nextInt();
            String s=sc.next();
            boolean possible = (l%2==0) || (s.charAt(0)=='a') || (s.charAt(0)=='?');
            for(int p=1;l%2==0 && possible && p<l;p+=2)
            {
                char d=s.charAt(p);
                char e=s.charAt(p-1);
                if(e==d && d!='?' && e!='?') 
                possible=false;
            }
            for(int p=1;l%2==1 && possible && 2*p<l;p++)
            {
                char d=s.charAt(2*p);
                char e=s.charAt(2*p-1);
                if(d!='?' && e!='?' && d==e)
                possible=false;
            }
             System.out.println(possible?"yes":"no");
        }
    }
}

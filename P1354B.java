import java.util.Scanner;
public class P1354B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int last[]={-1,-1,-1,-1};
            int len=s.length()+1;
            boolean found=false;
            for(int i=0;i<len-1;i++)
            {
                last[s.charAt(i)-'0']=i;
                int prev=Math.min(Math.min(last[1],last[2]),last[3]);
                if(prev<0)
                continue;
                found=true;
                len=Math.min(len,i-prev+1);
            }
            System.out.println(found?len:0);
        }
    }}

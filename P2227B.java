import java.util.Scanner;
public class P2227B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            int n=sc.nextInt();
            String s=sc.next();
            int c=0,d=0;
            for(char i:s.toCharArray())
            {
                if(i=='(')
                ++c;
                else ++d;
            }
            System.out.println((c==d)?"YES":"NO");
        }
    }
}

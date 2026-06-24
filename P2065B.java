import java.util.Scanner;
public class P2065B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            String s = sc.next();
            boolean same=false;
            for(int i=1;!same && i<s.length();i++)
            same=s.charAt(i-1)==s.charAt(i);
            System.out.println(same?1:s.length());
        }
    }
}

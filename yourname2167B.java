import java.util.HashMap;
import java.util.Scanner;

public class yourname2167B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            HashMap<Character,Integer> a,b=new HashMap<>();
            a=b=null;
            int n=sc.nextInt();
            sc.nextLine();
            String g=sc.nextLine();
            String s=sc.nextLine();
            for (int i = 0; i < n; i++) {
                char d=g.charAt(i);
                char c=s.charAt(i);
                a.put(d,a.getOrDefault(d, 0)+1);
                b.put(c,b.getOrDefault(c, 0)+1);
            }
            System.out.println(a.equals(b)?"YES":"NO");
        }
    }
}

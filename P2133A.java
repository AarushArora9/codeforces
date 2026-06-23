import java.util.Scanner;
import java.util.HashSet;
public class P2133A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            int n = sc.nextInt();
            boolean chk=false;
            HashSet<Integer> set=new HashSet<>();
            for(int i=0;i<n;i++)
            {
                int a=sc.nextInt();
                if(set.contains(a))
                chk=true;
                else set.add(a);
            }
            System.out.println(chk?"YES":"NO");
        }
    }
}

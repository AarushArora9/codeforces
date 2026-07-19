import java.util.Scanner;
import java.util.TreeSet;
public class P2175A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            long n=sc.nextInt();
            TreeSet<Long> numbers = new TreeSet<>();
            for(int i=0;i<n;i++)
            numbers.add(sc.nextLong());
            long ans=0;
            for(long i:numbers)
            {
                if(i>=numbers.size())
                {
                    ans=i;
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}

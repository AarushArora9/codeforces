import java.util.*;
public class P2053C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  
        int t=sc.nextInt();
        while(t-->0)
        {
        int n=sc.nextInt();
        int k=sc.nextInt();
        int mul = n + 1, sum = 0, cur = 1;
		while (n >= k) {
			if ((n&1)==1)
			sum += cur;
			n >>= 1;
			cur <<= 1;
		}
        System.out.println((long)mul*sum/2);
        }
    }
}

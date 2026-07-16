import java.util.Scanner;
public class P2236A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            int n=sc.nextInt(),max=0,min=10;
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
                max=Math.max(max,arr[i]);
                min=Math.min(min,arr[i]);
            }
            System.out.println(max-min+1);
        }
    }
}

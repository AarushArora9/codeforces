import java.util.Scanner;
public class P2225A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long x=sc.nextLong();
            long y=sc.nextLong();
            System.out.println((x*2>=y)?"NO":"YES");
        }
    }
}

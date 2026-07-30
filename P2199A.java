import java.util.Scanner;
public class P2199A {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int k=sc.nextInt();
            int a1=sc.nextInt();
            int b1=sc.nextInt();
            int a2=sc.nextInt();
            int b2=sc.nextInt();
            int a=a1+a2;
            int b=b1+b2+k;
            boolean bob=false;
            if(a==b && a1>b1 && a2>b2)
            bob=!bob;   
            else if(a>b)
            bob=!bob;
            System.out.println(bob?"NO":"YES");
        }
    }
}

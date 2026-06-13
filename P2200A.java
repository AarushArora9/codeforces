import java.util.Scanner;
public class P2200A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        while(l-->0)
        {
            int n=sc.nextInt();
            int max=-1,count=0;
            for(int i=0;i<n;i++)
            {
                int t=sc.nextInt();
                if(t>max)
                {
                    max=t;
                    count=1;
                }
                else if(t==max)
                count++;
            }
            System.out.println(count);
        }
    }
}

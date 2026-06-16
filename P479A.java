import java.util.Scanner;
public class P479A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int arr[]={
        a+b*c,
        a*b+c,
        a*b*c,
        a+b+c,
        (a+b)*c,
        a*(b+c)
        };
        int max=arr[1];
        for(int i:arr)
        {
            if(i>max)
            max=i;
        }
        System.out.println(max);
    }
}

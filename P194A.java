import java.util.Scanner;
public class P194A{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        System.out.println((k > 3 * n) ? 0 : 3 * n - k);
    }}

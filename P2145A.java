import java.util.Scanner;
public class P2145A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
        System.out.println((3-sc.nextInt()%3)%3);
        }
    }
}

import java.util.Scanner;
public class P312B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double s=a/b,z=1.0-c/d,n=1.0-s;
        System.out.println(s/(1.0-n*z));
    }
}

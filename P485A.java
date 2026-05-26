import java.util.Scanner;

public class Factory {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int m = sc.nextInt();
    
    // Remove all factors of 2 from m
    while(m % 2 == 0) {
      m = m / 2;
    }
    
    // Check if a is divisible by the odd part of m
    if(a % m == 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}

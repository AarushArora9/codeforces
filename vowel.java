import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    s=s.toLowerCase();
        String g="";
        for(int i=0;i<s.length();i++)
        {
            char d=s.charAt(i);
            if("aieouy".indexOf(d)>=0)
            continue;
            else
            g=g+"."+d;
        }
        System.out.println(g);
    }
}
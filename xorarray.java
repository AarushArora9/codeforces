import java.util.ArrayList;
import java.util.Scanner;

public class xorarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        //ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int l=sc.nextInt();
            int r=sc.nextInt();
            int pref[]=new int[n+1];
            for(int j=1;j<=n;j++)
                pref[j]=j<<10;
            pref[r]=pref[l-1];
            int a[]=new int[n];
            for(int j=1;j<=n;i++)
                a[i]=pref[j]^pref[j-1];
            for(int k: a)
                System.out.print(k+" ");
            System.out.println();
        }
    }
}

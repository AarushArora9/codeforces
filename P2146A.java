import java.util.Scanner;
import java.util.ArrayList;
public class P2146A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            ArrayList<Integer> list=new ArrayList<>();
            int prev=-1,cnt=1;
            for(int i=0;i<n;i++)
            {
                int a=sc.nextInt();
                if(a==prev)
                cnt++;
                else if(i>0)
                {
                    list.add(cnt);
                    cnt=1;
                }
                prev=a;
            }
            list.add(cnt);
            list.sort(null);
            int max=0;
            for(int i=0;i<list.size();i++)
            max=Math.max(max,(list.size()-i)*list.get(i));
            System.out.println(max);
        }
        
    }
}

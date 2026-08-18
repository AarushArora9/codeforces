import java.util.Scanner;
public class P2256A {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in );
      int t=sc.nextInt();
      while(t-->0)
      {
        int arr[]=new int[3];
        arr[0]=sc.nextInt();
        arr[1]=sc.nextInt();
        arr[2]=sc.nextInt();
        while(true)
        {
          int max=Math.max(arr[0],Math.max(arr[1],arr[2]));
          int min=Math.min(arr[0],Math.min(arr[1],arr[2]));
          arr[1]=(arr[0]+arr[1]+arr[2])-max-min;
          arr[0]=min;
          arr[2]=max;
          if(arr[0]+arr[1]>=arr[2])
          {
          System.out.println(arr[2]-arr[0]);
          break;
          }
          else
          arr[2]=arr[1]+arr[0];
        }      
      }
    }
}

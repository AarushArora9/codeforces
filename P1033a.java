import java.util.Scanner;
public class P1033A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        short n=sc.nextShort();
        short ax=sc.nextShort();
        short ay=sc.nextShort();
        short bx=sc.nextShort();
        short by=sc.nextShort();
        short cx=sc.nextShort();
        short cy=sc.nextShort();
        boolean possible=true;
        if(by<ay && ay<cy)possible=false;
        if(cx<ax && ax<bx)possible=false;
        if(bx<ax && ax<cx)possible=false;
        if(cy<ay && ay<by)possible=false;
        System.out.println(possible?"YES":"NO");
    }
}

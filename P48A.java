import java.util.Scanner;

public class P48A {
    public static void main(String[] args) {
        int[] tool = new int[3];
        Scanner scanner = new Scanner(System.in);

        for (int k = 0; k < 3; k++) {
            String temp = scanner.nextLine();

            if (temp.charAt(0) == 'r') {
                tool[k] = 0;
            } else if (temp.charAt(0) == 'p') {
                tool[k] = 1;
            } else if (temp.charAt(0) == 's') {
                tool[k] = 2;
            }
        }

        if (tool[0] != tool[1] && tool[1] == tool[2] && (3 + tool[0] - tool[1]) % 3 == 1) {
            System.out.println("F");
        } else if (tool[1] != tool[0] && tool[0] == tool[2] && (3 + tool[1] - tool[2]) % 3 == 1) {
            System.out.println("M");
        } else if (tool[2] != tool[0] && tool[0] == tool[1] && (3 + tool[2] - tool[0]) % 3 == 1) {
            System.out.println("S");
        } else {
            System.out.println("?");
        }

        scanner.close();
    }
}

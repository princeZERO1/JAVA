import java.util.Scanner;

public class Pascalsdia {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        disp(n);
    }

    public static void disp(int n) {
        // Upper half (including middle)
        for (int row = 0; row < n; row++) {
            // Leading spaces
            for (int sp = 0; sp < n - row - 1; sp++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 0; j <= row; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower half (mirror of upper, excluding middle)
        for (int row = n - 2; row >= 0; row--) {
            // Leading spaces
            for (int sp = 0; sp < n - row - 1; sp++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 0; j <= row; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//i=1;i<=(2*n)-1;i++
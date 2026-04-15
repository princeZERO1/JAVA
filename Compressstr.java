import java.util.Scanner;

public class Compressstr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String st1 = s.nextLine();
        disp(st1);
    }

    public static void disp(String st1) {
        int count = 1;
        for (int i = 1; i < st1.length(); i++) {
            char prev = st1.charAt(i - 1);
            char ch = st1.charAt(i);

            if (prev == ch) {
                count++;
            } else {
                System.out.print(prev + "" + count);//if we didn't give the empty string "" the char and count didn't give the value --> because char and count didn't give output as together
                count = 1;
            }
        }
        // Print the last character group
        System.out.print(st1.charAt(st1.length() - 1) + "" + count);
    }
}
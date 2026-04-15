import java.util.Scanner;
public class Gcd{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		disp(a,b);
	}
	public static void disp(int a, int b){
		int gcd =1;
		int lcm=0;
		int min = (a<b)? a:b;
		for (int i =1;i<=min;i++){
			if (a%i==0 && b%i==0){
				System.out.print(i + " ");
				gcd=i;
				lcm = (a*b)/gcd;
			}
		}
		System.out.println("\nGCD of " + a + " and " + b + " is: " + gcd);
		System.out.println("\nLCM of " + a + " and " + b + " is: " + lcm);
	}
}
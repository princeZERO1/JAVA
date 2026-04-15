import java.util.Scanner;
public class Factorialiteration{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		num(n);
	}
	public static void num(int n){
		int fact=1;
		for (int i=n;i>1;i--){
			fact = fact*i;
		}
		System.out.println("Factorial of given number:"+fact);
	}
}
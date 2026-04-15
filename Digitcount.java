import java.util.Scanner;
public class Digitcount{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		disp(n);
	}
	public static void disp(int n){
		int count=0;
		while (n>0){
			n=n/10;
			count++;
		}
		System.out.println(count);
	}
}
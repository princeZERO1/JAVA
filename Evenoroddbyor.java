import java.util.Scanner;
public class Evenoroddbyor{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		display(n);
		
	}
	public static void display(int n){
		if ((n|1)==n){
			System.out.println("the number is odd");
		}
		else{
			System.out.println("the number is even");
		}
	}
}
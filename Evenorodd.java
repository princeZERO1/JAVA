import java.util.Scanner;
public class Evenorodd{
	public static void main(String[] args){
		Scanner s =new Scanner(System.in);
		int n = s.nextInt();
		display(n);
	}
	public static void display(int n){
		if((n&1)==0){
			System.out.println("Even number");
		}
		else{
			System.out.println("Odd number");
		}
		
	}
}
import java.util.Scanner;
public class Righttri{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		display(n);
	}
	public static void display(int n){
		for(int row = 1; row<=n; row++){
			for(int col=1;col<=row;col++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
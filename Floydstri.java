import java.util.Scanner;
public class Floydstri{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		disp(n);
	}
	public static void disp(int n){
		int number = 1;
		for (int row=1;row<=n;row++){
			for(int col=1;col<=row;col++){
				System.out.print(number+ " ");
				number++;
			}
			System.out.println();
		}
	}
}
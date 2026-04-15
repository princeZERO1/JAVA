import java.util.Scanner;
public class Inverttri{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		disp(n);
	}
	public static void disp(int n){
		for(int row=1; row<=n; row++){//backward row=n;row>=1;row--
			for(int col=0;col<=n-row;col++){//backward col=1;col<=row;col++
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
}
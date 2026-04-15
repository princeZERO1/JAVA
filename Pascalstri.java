import java.util.Scanner;
public class Pascalstri{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		disp(n);
	}
	public static void disp(int n){
		for(int row=0;row<n;row++){
			int number=1;
			for(int s=1;s<n-row;s++){
				System.out.print(" ");
			}
			for(int j=0;j<=row;j++){
				if (j==0){
					System.out.print(number+ " ");
			    }
				else{
					number=number*(row-j+1)/j;
					System.out.print(number+ " ");
				}
			}
			System.out.println();
		}
	} 
}
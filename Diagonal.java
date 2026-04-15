import java.util.Scanner;
public class Diagonal{
	public static void main(String[] args){
		Scanner s =new Scanner(System.in);
		int row = s.nextInt();
		int col = s.nextInt();
		int[][] arr = new int[row][col];
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				arr[i][j]=s.nextInt();
			}
		}
		disp(row,col,arr);
	}
	public static void disp(int row, int col, int[][] arr){
		System.out.println("Matrix before Diagnol");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		int l =0;//left
		int r =0;//right
		for(int i=0;i<row;i++){
			for(int j =0;j<col;j++){
				if(i==j){
					l=l+arr[i][j];
				}
				if(i+j==row-1){
					r=r+arr[i][j];
				}
			}
		}
		System.out.println("Sum of Left Diagonal: "+ l);
		System.out.println("Sum of Right Diagonal: "+r);
		System.out.println("Sum of Diagonal elements: "+ (r+l));
		System.out.println();
	}
}
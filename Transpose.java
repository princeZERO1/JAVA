import java.util.Scanner;
public class Transpose{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		int col = s.nextInt();
		int[][] arr =new int[row][col];
		for (int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				arr[i][j]=s.nextInt();
			}
		}
		disp(row,col,arr);
	}
	public static void disp(int row, int col, int[][] arr){
		System.out.println("Matrix before Transpose");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Transpose Matrix");
		for(int i=0;i<col;i++){
			for(int j=0;j<row;j++){
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
	}
	
}
import java.util.Scanner;
public class Matrixsum{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		int col = s.nextInt();
		int[][] arr =new int [row][col];
		for (int i=0;i<row;i++){
			for (int j=0;j<col;j++){
				arr[i][j]=s.nextInt();
			}
		}
		disp(row,col,arr);
	}
	public static void disp(int row, int col, int[][] arr){
		System.out.println("Matrix");
		int max_row=-1;//i didnt know which row is max so give negative index
		int max=0;
		for(int i=0;i<row;i++){
			int sum = 0;
			for(int j=0;j<col;j++){
				System.out.print(arr[i][j]+" ");
				sum=sum+arr[i][j];
			}
			System.out.println();
			if(sum>max){
				max = sum;
				max_row=i;
			}
		}
		System.out.println("Row index with max sum: "+ max_row+" , Sum value:"+max);
	}
}
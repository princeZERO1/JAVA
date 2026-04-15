import java.util.Scanner;//Syntax= datatype[][] arrayname = new datatype[rowsize][columnsize]
public class Matrix{//int[][] arr =new int [3][4]
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		int column = s.nextInt();
		int[][] arr =new int [row][column];
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				arr[i][j] = s.nextInt();
			}
		}
		disp(arr,row,column);
	}
	public static void disp(int[][] arr, int row, int column){// if i dont give row and column in this line i can use arr.lengthin nestedd loop
		System.out.println("MATRIX");
		for(int i=0;i<row;i++){// change row into arr.length and column into arr[0].length
			for(int j=0;j<column;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

		
	}
}// if calling the fuction (int[][] arr , int .. , int ..)
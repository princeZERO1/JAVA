import java.util.Scanner;
public class Rotatematrix{//clockwise = its work by first do transpose and reverse it gives as clockwiae output --> 90degree
	public static void main(String[] args ){
		Scanner s = new Scanner(System.in);
		//int row = s.nextInt();
		//int col = s.nextInt();
		int n = s.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				arr[i][j]=s.nextInt();
			}
		}
		disp(arr,n);
	}
	public static void disp(int[][] arr,int n){
		System.out.println("Matrix before Rotate");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();//step 1 transpose
		for(int i=0;i<n-1;i++ ){
			for(int j=i+1;j<n;j++){
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		for (int i=0;i<n;i++){//step 2 code reverse
			int l=0;
			int r=n-1;
			while(l<r){
				int temp = arr [i][l];
				arr[i][l] = arr[i][r];
				arr[i][r] = temp;
				l++;
				r--;
			}
			
		}
		System.out.println("Matrix Rotate of Clockwise 90 deg	");//step 3 outputdisplay
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
// addition
import java.util.*;
public class Subarray{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
	    int n = s.nextInt();
	    int arr[] = new int[n];
	    System.out.println("Enter " + n + " elements:");
		 for (int i = 0; i < n; i++) {
			arr[i]= s.nextInt();
		}
		System.out.println("Enter the k value: ");
		int k = s.nextInt();
		display(arr,n,k);
	}
	public static void display(int[] arr,int n,int k){
		int max=0;
		for(int i=0;i<=n-k;i++){
			int sum=0;
			for(int j=0;j<k;j++){
				sum=sum+arr[i+j];
			}
			if(sum>max){
				max=sum;
			}
			
		}
		System.out.println(max);
	}
}
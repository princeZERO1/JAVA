import java.util.*;
public class Subarray2{
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
		
		for(int i=0;i<=n-k;i++){
			int max=arr[i];
			for(int j=1;j<k;j++){
				if(arr[i+j]>max){
					max=arr[i+j];
				}
			}
			System.out.print(max+" ");
		}
		
	}
}
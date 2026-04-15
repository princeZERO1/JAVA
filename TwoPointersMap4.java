//we using Two pointers for sorted array if is unsorted we can use Hashmap
import java.util.*;
public class TwoPointersMap4{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
	    System.out.println("Enter the size of the array: ");
	    int n = s.nextInt();
	    int arr[] = new int[n];
	    System.out.println("Enter " + n + " elements:");
	    for (int i = 0; i < n; i++) {
			arr[i]= s.nextInt();
		}
		System.out.println("Enter the target value: ");
		int target = s.nextInt();
		display(arr,n,target);
	}
	public static void display(int[] arr, int n,int target){
		int i =0;
		int j =n-1;
		boolean tarvar = false;
		while (i<j){
			if(arr[i]+arr[j]==target){
				tarvar = true;
				break;
			}
			else if(arr[i]+arr[j]<target){
				i++;
			}
			else if (arr[i]+arr[j]>target){
				j--;
			}
		}
		if(tarvar == true){
			System.out.println("Pair found in the array: "+tarvar);
		}
		else
		System.out.println("Pair found in the array: "+tarvar);
	}
}


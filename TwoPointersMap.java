//we using Two pointers for sorted array if is unsorted we can use Hashmap
import java.util.*;
public class TwoPointersMap{
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
		Arrays.sort(arr);
		boolean tarvar = false;
		for(int k =0;k<n-2;k++){
			int required = target - arr[k];
			int i =k+1;
			int j=n-1;
			while(i<j){
				if(arr[i]+arr[j]==target){
					System.out.println("Pair found in the array: "+arr[k] + ", " + arr[i] + ", " + arr[j]);
					tarvar = true;
				    break;
			    }
			    else if(arr[i]+arr[j]<required){
				    i++;
			    }
			    else if (arr[i]+arr[j]>required){
				    j--;
			    }
			}
        }
		if(!tarvar){
			System.out.println("Pair found in the array: "+tarvar);
		}
		
	}
}


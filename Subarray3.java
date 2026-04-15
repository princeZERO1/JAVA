//Count distinct elements in subarray of size k, distinct means unique or different value not duplicate
// sizeof is used in list is count the elements even with duplicate elements
import java.util.*;
public class Subarray3{
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
		for (int i=0;i<=n-k;i++){
			Set<Integer> s = new HashSet<Integer>();
			for (int j=0;j<k;j++){
				s.add(arr[i+j]);
			}
			System.out.print(s.size()+" ");
		}
		
	}
}




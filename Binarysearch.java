import java.util.*;
public class Binarysearch{// array have to give in ascending order
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		System.out.print("Enter the number of element to find in the array: ");
		int key = s.nextInt();
		disp(arr,n,key);
	}
	public static void disp(int[] arr, int n, int key){
		int l=0;
		int r =n-1;
		int index=-1;
		while(l<=r){
			int mid=(l+r)/2;
			if(arr[mid]==key){
				index=mid;
				break;
			}
			else if(key>arr[mid]){
				l=mid+1;
			}
			else{
				r=mid-1;
			}
		}
		if(index==-1){
			System.out.println("Element not found");
		}
		else{
			System.out.println("Element " +key +" found at index: "+ index);
		}
	}
}
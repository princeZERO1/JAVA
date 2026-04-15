import java.util.*;
public class Linearsearch{
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
		int index=-1;
		for(int i=0;i<n;i++){
			if(arr[i]==key){
				index=i;
				break;
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
import java.util.*;
public class Insertionsort{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		disp(arr,n);
	}
	public static void disp(int[] arr,int n){				
		for(int i=1;i<n;i++){
			int currentelement= arr[i];
			int j = i-1;// > for backward also this "--"and < for forward also "++" element to travel
			while(j>=0 && currentelement<arr[j]){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=currentelement;
		}
		System.out.print("Sorted array in Insertion sort: ");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
	    }
	}
}
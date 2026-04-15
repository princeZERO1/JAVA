import java.util.*;
public class Selectionsort{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = s.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++){
			arr[i] = s.nextInt(); 
		}
		disp(arr,n);
	}
	public static void disp(int[] arr,int n){
		for (int i =0;i<n-1;i++){
			int min_index=i;
			
			for(int j=i+1;j<n;j++){
				if (arr[j]<arr[min_index]){
					min_index=j;
				}
			}
			if(i!=min_index){
				int temp = arr[i];
				arr[i]=arr[min_index];
				arr[min_index]=temp;
			}
		}
		System.out.print("Sorted array in Selection sort: ");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
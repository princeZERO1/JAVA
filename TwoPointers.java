import java.util.*;
public class TwoPointers{
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = s.nextInt();
		System.out.print("Enter the elements: ");
		int[] arr = new int[n];
		for (int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		maxwater(arr,n);
	}
	public static void maxwater(int[] arr,int n){
		int l =0;
		
		int r=n-1;
		int max=0;
		while(l<r){
			int water =(r-1)*Math.min(arr[l],arr[r]);
			if(water>max){
				max=water;
			}
			if(arr[l]<arr[r]){
				l++;
			}
			else{
				r--;
			}
		}
		System.out.println(max);
	}
}
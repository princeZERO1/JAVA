//"Trapped total water"
import java.util.*;
public class TwoPointers1{
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of elements: "); //12
		int n = s.nextInt();
		System.out.print("Enter the elements: "); // 0 1 0 2 1 0 1 3 2 1 2 1
		int[] arr = new int[n];
		for (int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		maxwater(arr,n);
	}
	public static void maxwater(int[] arr,int n){
		int l =0;
		int r=n-1;
		int water=0;
		int leftmax=0;
		int rightmax=0;
		while(l<r){	
			if(arr[l]<=arr[r]){
				if (arr[l]>=leftmax){ // not able to store water
					leftmax=arr[l];
				}
				else{
					water= water + leftmax-arr[l];
				}
				l++;
			}
			else{    //stores water
				if(arr[r]>=rightmax){
					rightmax=arr[r];
				}
				else{
					water = water+rightmax-arr[r];
				}
				r--;
			}
		}
		System.out.println("Trapped total water"+" "+water);//6
	}
}
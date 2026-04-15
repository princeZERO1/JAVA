import java.util.*;
public class  Bubblesort{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the array element: ");
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }
		disp(arr,n);
		
	}
	public static void disp(int[] arr, int n){
		for(int i=0;i<n-1;i++){
			boolean var=false;
			for(int j=0;j<n-1-i;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					 arr[j+1] = temp;
					 var=true;
				}
			}
			if(var==false)
				break;
		}
		System.out.print("Sorted array in Ascending order: ");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
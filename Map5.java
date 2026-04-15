import java.util.*;
public class Map5{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		 System.out.println("Enter the size of the array: ");
	    int n = s.nextInt();
	    int arr[] = new int[n];
	    System.out.println("Enter " + n + " elements:");
	    for (int i = 0; i < n; i++) {
			arr[i]= s.nextInt();
		}
		display(arr,n);
	}
	public static void display(int[] arr,int n){
		ArrayList<Integer> a = new ArrayList<>();
		for(int i=0;i<n;i++){
			if(!a.contains(arr[i])){
				a.add(arr[i]);
			}
		}
		for(int i=0;i<a.size();i++){
			System.out.print(a.get(i)+" ");
		}
	}
}
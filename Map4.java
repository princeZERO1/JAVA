import java.util.*;
public class Map4{
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
		HashMap<Integer,Integer> hm = new HashMap<>();
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i<arr.length;i++){
			if(hm.containsKey(target-arr[i])){
				list.add(hm.get(target-arr[i]));
				list.add(i);
			}
			else{
				hm.put(arr[i],i);
			}
		}
		System.out.println("The index which gives the target value: "+list);
	}
}
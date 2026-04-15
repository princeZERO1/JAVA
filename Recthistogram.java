//	Largest rectangle in Histogram
// prev(0 to n-1)= left to right, next (n-1 to 0 )= right to left
// greater = s.peek()<=arr[i] , smaller = s.peek()>=arr[i]
//Monoconic Stack process
import java.util.*;
public class Recthistogram{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size of the Array: ");
		int n= s.nextInt();
		int[] arr= new int[n];
		System.out.println("Enter " + n + " elements:");
		for(int i = 0; i < n; i++){
        arr[i] = s.nextInt();
		}
		disp(arr,n);
	}	
	public static void disp(int[] arr, int n){
		int[] leftsmall= new int[n];
		int[] rightsmall = new int[n];
		Stack <Integer> s = new Stack<Integer>();
		for(int i=0;i<n;i++){
			while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
				s.pop();
			}
			if(s.isEmpty()){
				leftsmall[i]=0	;
			}
			else{
				leftsmall[i]=s.peek()+1	;
			}
			s.push(i);
		}
		while(!s.isEmpty()){
			s.pop();
		}
		for(int i=n-1;i>=0;i--){
			while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
				s.pop();
			}
			if(s.isEmpty()){
				rightsmall[i]=n-1;
			}
			else{
				rightsmall[i]=s.peek()-1;
			}
			s.push(i);
		}
		int max =0;
		for(int i=0;i<n;i++){
			int area = (rightsmall[i]-leftsmall[i]+1)*arr[i];
			if(area>max){
				max=area;
			}
		}
		System.out.println(max);
	}
}
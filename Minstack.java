//Design MIN stack
// we doing push fuction in this push function we also do the Min stack
import java.util.*;
public class Minstack{
	int min;
	Stack<Integer> s;
	public Minstack(){
		s=new Stack<Integer>();
		min= Integer.MAX_VALUE;
	}
	public static void main(String[] args){
		Minstack ob = new Minstack();
		ob.push(22);
		ob.push(25);
		ob.push(21);
		ob.getmin();
		ob.pop();
		ob.peek();
		/*Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size of the Array: ");
		int n= s.nextInt();
		int[] arr= new int[n];
		System.out.println("Enter " + n + " elements:");
		for(int i = 0; i < n; i++){
        arr[i] = s.nextInt();
		}
		disp(arr,n); */
	}
	public void push(int data){
		if(s.isEmpty()){
			s.push(data);
			min=data;
		}
		else if(data>min){
			s.push(data);
		}
		else{
			s.push(2*data-min);
			min=data;
		}
	}
	public void pop(){
		if(s.isEmpty()){
			System.out.print("Stack underdeflow");
		}
		int top=s.pop();
		if(top<min){
			min=2*min-top;
		}
	}
	public void getmin(){
		System.out.println("Minimum: "+min);
	}
	public void peek(){
		int top=s.peek();
		if(top<min){
			System.out.println("Top element: "+min);
		}
		else{
			System.out.println("Top element: "+top);
		}
	}
}
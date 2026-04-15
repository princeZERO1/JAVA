import java.util.*;
public class Lab6{
	public static void main(String[] args){
		Stack<String> str = new Stack<>();
		str.push("C");
		str.push("C++");
		str.push("Java");
		str.push("Python");
		System.out.println(str.peek());
		str.pop();
		System.out.println("new top element: "+str.peek());
		while(!str.isEmpty()){
			System.out.println(str.pop());
		}
	}
}

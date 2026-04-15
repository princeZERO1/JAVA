import java.util.*;
public class Queue1{
	public static void main(String[] args){
		Queue<String> q = new LinkedList<>();
		q.offer("C");
		q.offer("C++");
		q.offer("Java");
		q.offer("Python");
		System.out.println(q.peek());
		q.poll();
		System.out.println("new first or front element is: "+q.peek());
		while(!q.isEmpty()){
			System.out.print(q.poll()+" ");
		}
	}
}
import java.util.*;
public class Dequeue{
	public static void main(String[] args){
		Deque<Integer> dq = new ArrayDeque<>();
		dq.add(10);
		dq.add(20);
		dq.add(30);
		System.out.println("Front element:"+dq.peekFirst());
		dq.addFirst(40);
		dq.addLast(50);
		System.out.println("New Front element:"+dq.peekFirst());
		System.out.println(dq);
		dq.removeFirst();
		dq.removeLast();
		System.out.println(dq);
		while(!dq.isEmpty()){
			System.out.print(dq.poll()+" ");
		}
	}
}
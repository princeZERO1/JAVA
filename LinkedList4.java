// Find the middle node
// if there is odd node like 1 2 3 4 5 ==> we can easily identify the middle node
// when it comes to the even node like 1 2 3 4 5 6 ==> the middle nodes are 3 and 4 , so the i question they either this or that -->(3 or 4).we have to write the code dynamically for both 
// there is slow and fast pointer ==> slow moves from 1 step of node, fast moves from 2 steps of node
import java.util.*;
class Node{
	int data;
	Node next;
	public Node (int data){
		this.data=data;
		this.next=null;
	}
}
public class LinkedList4{
	public static Node head = null;
	public static Node temp = null;
	public static void create(int data){
		Node newnode = new Node(data); //constructor call
		if(head==null){
			head=temp=newnode;
		}
		else{
			temp.next = newnode;
			temp=newnode;
		}
	}
		public static void display(){
		temp=head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	public static void middle(){
		Node slow =head;
		Node fast = head;
		while(fast!=null && fast.next!=null){ // if we give codition like this (fast.next!=null && fast!=null) it gives error
			slow=slow.next;//1 position
			fast = fast.next.next;//2 position
		}
		System.out.println("The Middle node from the given Nodes is: "+slow.data);
	}
	public static void main(String[] args){
		System.out.println("Enter the number, add null at the end: ");
		Scanner s = new Scanner(System.in);
		while(true){
			String str = s.next();
			try{
				create(Integer.parseInt(str));
			}
			catch(Exception e){
				break;
			}
		}
		System.out.println();
		System.out.println("Created nodes are:");
		display();
		System.out.println();
		middle();
	}
}
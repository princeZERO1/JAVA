import java.util.*;
class Node{
	int data;
	Node next;
	public Node (int data){
		this.data=data;
		this.next=null;
	}
}
public class LinkedList{
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
		System.out.println("Created nodes are:");
		temp=head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		while
		(true){
			String str = s.next();
			try{
				create(Integer.parseInt(str));
			}
			catch(Exception e){
				break;
			}
		}
		display();
	}
}
//8 2 3 4 null
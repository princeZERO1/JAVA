import java.util.*;
class Node{
	int data;
	Node next;
	public Node (int data){
		this.data=data;
		this.next=null;
	}
}
public class LinkedList1{
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
	public static void insert_first(int data){
		Node newnode = new Node(data);
		if(head==null){
			head=newnode;
		}
		else{
			newnode.next=head;
			head=newnode;
		}
	}
	public static void insert_end(int data){
		Node newnode= new Node(data);
		temp=head;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=newnode;
	}
	public static void insert_at_location(int data, int pos){
		Node newnode = new Node(data);
		temp=head;
		int i=1;
		while (i<pos-1){
			temp=temp.next;
			i++;
		}
		newnode.next=temp.next;
		temp.next=newnode;
		
	}
	public static void main(String[] args){
		System.out.println("Enter the number, add null at the end: ");
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
		System.out.println();
		System.out.println("Insert element at first:");
		int a = s.nextInt();
		insert_first(a);
		display();
		// 
		System.out.println(); 
	
		System.out.println();
		System.out.println("Insert element at end:");
		int b = s.nextInt();
		insert_end(b);
		display();
		// 
		System.out.println();
		System.out.println("Insert element to change at position: ");
		int c = s.nextInt();
		System.out.println("Enter the position to insert the element: ");
		int pos = s.nextInt();
		insert_at_location(c,pos);
		display();
	}
}
import java.util.*;
class Node{
	int data;
	Node next;
	public Node (int data){
		this.data=data;
		this.next=null;
	}
}
public class LinkedList2{
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
	public static void delete_first(){
		if(head==null){
			System.out.println("list is empty");
		}
		else{
			head=head.next;
		}
	}
	public static void delete_end(){
		temp=head;
		Node prev = null;
		while(temp.next!=null){
			prev=temp;
			temp=temp.next;
		}
		prev.next=null;
	}
	public static void delete_at_position(int pos){
		int i=1;
		temp=head;
		while(i<pos-1){
			temp=temp.next;
			i++;
		}
		Node nextnode=temp.next;
		temp.next=nextnode.next;
		nextnode.next=null;
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
		delete_first();
		System.out.println("After deletion first:");
		display();
		//
		System.out.println();
		delete_end();
		System.out.println("After deletion end:");
		display();
		//
		System.out.println();
		System.out.print("Enter position to delete: ");
        int pos = s.nextInt();
        delete_at_position(pos);
        System.out.println("After deletion at given position:");
        display();
		
	}
}
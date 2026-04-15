//Reverse a linked list

import java.util.*;
class Node{
	int data;
	Node next;
	public Node (int data){
		this.data=data;
		this.next=null;
	}
}
public class LinkedList3{
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
	public static void reverse(){
		temp=head;
        Node nextnode =head;
        Node prev = null;
        while(temp!=null){
			nextnode = temp.next;
	        temp.next=prev;
	        prev=temp;
	        temp=nextnode;
        }
		head=prev;
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
		reverse();
		System.out.println("The Reversed linkedlist: ");
		display();
	}
}	

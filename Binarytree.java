import java.util.*; // this is for Inorder
class Node{
    int data;
	Node left;
	Node right;
	public Node(int data){  //construct
	    this.data=data;
		this.left=null;
		this.right=null;
	}
}
public class Binarytree{
	public static Node create(){
		Scanner s = new Scanner(System.in);
		int data =s.nextInt();
		if(data<=0){  // it will never create the node that are in negative and zero
			return null;
		}
		Node newnode = new Node(data);  // now newnode contains the first address of the node 
		System.out.println("Enter the left child of: "+data);
		newnode.left=create();
		System.out.println("Enter the right child of: "+data);
		newnode.right=create();
		return newnode;      // return address
	}
	public static void inorder(Node root){
		if(root==null){
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
		
	}
	public static void main(String[] args){
		Node root = null;
		root=create();
		System.out.println("Inorder transversal");
		inorder(root);
	}
	
}
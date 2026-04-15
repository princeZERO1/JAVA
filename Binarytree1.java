import java.util.*; // this is for Preorder
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
public class Binarytree1{
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
	public static void preorder(Node root){
		if(root==null){
			return;
		}
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
		
	}
	public static void main(String[] args){
		Node root = null;
		root=create();
		System.out.println("Preorder transversal");
		preorder(root);
	}
	
}
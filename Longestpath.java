//Longest path sum in binary tree 
import java.util.*; 
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
public class Longestpath{
	public static Node create(){
		Scanner s = new Scanner(System.in);
		int data =s.nextInt();
		if(data==0){  // it will never create the node that are in negative and zero
			return null;
		}
		Node newnode = new Node(data);  // now newnode contains the first address of the node 
		System.out.println("Enter the left child of: "+data);
		newnode.left=create();
		System.out.println("Enter the right child of: "+data);
		newnode.right=create();
		return newnode;      // return address
	}
	public static void levelorder(Node root){
		Queue<Node> q =new java.util.LinkedList<Node>();
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		q.offer(root);
		while(!q.isEmpty()){
			int size = q.size(); 
			ArrayList<Integer> a =new ArrayList<Integer>();
			for(int i=0;i<size;i++){
				Node current = q.poll(); 
				if(current.left != null){
					q.offer(current.left);
                }
                if(current.right != null){
                    q.offer(current.right);
                }
				a.add(current.data);
			}
			list.add(a);
		}
		System.out.println(list);
	}
	public static int path(Node root){
		int[] max = new int[1];
		pathsum(root,max);
		return max[0];
	}
	public static int pathsum(Node root,int[] max){
		if(root==null){
			return 0;
		}
		int lh = Math.max(0,pathsum(root.left,max));
		int rh = Math.max(0,pathsum(root.right,max));
		max[0]=Math.max(max[0],root.data+lh+rh);
		return root.data+Math.max(lh,rh);
	}
	
	public static void main(String[] args){
		Node root = null;
		root=create();
		System.out.println("Leveltorder transversal");
		levelorder(root);
		System.out.println(path(root));
	}
	
}
//Height of binary tree we going to count the nymber of the levels instead of show data in each level for this we using recursive approach
import java.util.*; // this is for Level order
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
public class Binarytree5{
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
	public static void levelorder(Node root){
		Queue<Node> q =new java.util.LinkedList<Node>();
		/*ArrayList<Integer> a =new ArrayList<Integer>();
for(int i=0;i<q.size();i++){
    if(q.peek().left!=null){
        q.offer(q.peek().left);
    } 
    if(q.peek().right!=null){
        q.offer(q.peek().right);
    }
    a.add(q.poll().data);
}*/
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
	public static int height(Node root){
		if(root==null){
			return 0;
		}
		int lh=height(root.left);
		int rh=height(root.right);
		return 1+Math.max(lh,rh);
	}
	public static void main(String[] args){
		Node root = null;
		root=create();
		System.out.println("Leveltorder transversal");
		levelorder(root);
		System.out.println("Height of tree: " + height(root));
	}
	
}
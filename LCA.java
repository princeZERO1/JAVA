// Lowest common Ancestor , Ancestor --> path from given node to root node
// ex 1=> LCA(4,6)=2, 4-->1,2,4  6-->1,2,5,6
// ex 2=> LCA(5,7)=1, 5-->1,2,5  7-->1,3,7


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
public class LCA{
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
	public static Node lca(Node root,int p, int q){
		if(root==null || root.data==p || root.data==q){
			return root;
		}
		Node left=lca (root.left,p,q);
		Node right=lca (root.right,p,q);
		if(left==null){
			return right;
		}
		else if(right==null){
			return left;
		}
		else {
			return root;
		}
	}
	
	public static void main(String[] args){
		Node root = null;
		root=create();
		System.out.println("Leveltorder transversal");
		levelorder(root);
		Node result=lca(root,4,6);
		System.out.println("The LCA of the Tree is: "+result.data);
	}
	
}
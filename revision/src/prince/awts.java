package prince;

class Node{
	int key;
	Node left,right;
	
	Node(int k){
		key = k;
		left = right= null;
	}
}


public class awts {
	Node root;
	
	public void traverse(Node node) {
		if(node!=null) {
			traverse(node.left);
			System.out.print(node.key);
			traverse(node.right);
		}
	}

	public static void main(String[] args) {
		awts tree= new awts();
		
		tree.root= new Node(1);
		tree.root.left= new Node(2);
		tree.root.right= new Node(3);
		tree.root.left.right = new Node(4);
		
		System.out.println("Binary tree");
		tree.traverse(tree.root);
	}

}

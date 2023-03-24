class Node {
	int data;
	Node left, right;
	Node(int data)
	{
		this.data = data;
		this.left = this.right = null;
	}
}

class CreateBSTFromPreorder {
	private static Node node;

	public static Node createNode(Node node, int data){
		if (node == null)
			node = new Node(data);
		if (node.data > data)
			node.left = createNode(node.left, data);
		if (node.data < data)
			node.right = createNode(node.right, data);
		return node;
	}

	public static void create(int data){
		node = createNode(node, data);
	}
	public static void inorderRec(Node root){
		if (root != null) {
			inorderRec(root.left);
			System.out.print(root.data);
			System.out.print(" ");
			inorderRec(root.right);
		}
	}

	public static void main(String[] args){
		int[] nodeData = { 10, 5, 1, 7, 40, 50 };

		for (int i = 0; i < nodeData.length; i++) {
			create(nodeData[i]);
		}
        System.out.println();
		inorderRec(node);
        System.out.println();
	}
}

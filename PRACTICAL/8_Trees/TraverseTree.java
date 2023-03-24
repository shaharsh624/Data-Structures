import java.util.*;

class Node {
    int value;
    Node left, right;
    Node(int value) {
        this.value = value;
    }
}

public class TraverseTree {
    static Scanner input = new Scanner(System.in);
    static Node createTree() {
        Node root = null;

        System.out.print("Enter data: ");
        int item = input.nextInt();
        if(item == -1) {
            return null;
        }
        root = new Node(item);
        System.out.println("\nEnter left item for " + item);
        root.left = createTree();
        System.out.println("\nEnter right item for " + item);
        root.right = createTree();

        return root;
    }
    
    static void inorder(Node root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.value + " ");
        inorder(root.right);
    }
    
    static void preorder(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.value + " ");
        preorder(root.left);
        preorder(root.right);
    }
    
    static void postorder(Node root) {
        if(root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.value + " ");
    }
    
    public static void main(String[] args) {
        Node root = createTree();
        System.out.print("\nInorder Traversal: ");
        inorder(root);
        System.out.print("\nPreorder Traversal: ");
        preorder(root);
        System.out.print("\nPostorder Traversal: ");
        postorder(root);
    }
}
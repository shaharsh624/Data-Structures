import java.util.*;
public class TreeOp {
    static class Node{
        Node left, right;
        int value;
        public Node(int value){
            this.value = value;
        }
    }

    static Node createTree(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter data :: ");
        int item = sc.nextInt();
        if (item == -1){
            return null;
        }
        Node root = new Node(item);
        System.out.println("\nEnter left of " + item);
        root.left = createTree();
        System.out.println("\nEnter right of " + item);
        root.right = createTree();

        return root;
    }

    static void inorder(Node root){
        if (root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.value + " ");
        inorder(root.right);
    }
    static void preorder(Node root){
        if (root == null){
            return;
        }
        System.out.print(root.value + " ");
        preorder(root.left);
        preorder(root.right);
    }
    static void postorder(Node root){
        if (root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.value + " ");
    }

    public static void main(String[] args) {
        TreeOp tree = new TreeOp();
        Node root = createTree();
//        inorder(root);
    }

}

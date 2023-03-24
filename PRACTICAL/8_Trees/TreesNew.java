import java.util.Scanner;

public class Trees {
    static Node root;
    static class Node{
        Node left, right;
        int data;
        Node (int data){
            this.data = data;
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
        System.out.println("Enter left of " + item);
        root.left = createTree();
        System.out.println("Enter right of " + item);
        root.right = createTree();

        return root;
    }

    static void createBST(int key){
        root = UtilcreateBST(root, key);
    }
    static Node UtilcreateBST(Node root, int key){
        if (root == null){
            root = new Node(key);
            return root;
        }
        if (key<root.data){
            root.left = UtilcreateBST(root.left, key);
        }
        else if (key>root.data){
            root.right = UtilcreateBST(root.right, key);
        }
        return root;
    }

    static void inorder(Node root){
        if (root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = createTree();
        inorder(root);
        createBST(8);
        createBST(3);
        createBST(1);
        createBST(6);
        createBST(7);
        createBST(10);
        createBST(14);
        createBST(4);
    }
}

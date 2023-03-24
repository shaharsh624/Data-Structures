// Trees
/*
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
 */

// Traverse Trees
/*
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
 */

// Insert in Tree
/*
public class InsertInTree{
    static void insert(Node temp, int key)
    {

        if (temp == null) {
            root = new Node(key);
            return;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(temp);

        // Do level order traversal until we find
        // an empty place.
        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();

            if (temp.left == null) {
                temp.left = new Node(key);
                break;
            }
            else
                q.add(temp.left);

            if (temp.right == null) {
                temp.right = new Node(key);
                break;
            }
            else
                q.add(temp.right);
        }
    }
}
*/

//Search in Tree
/*
    void search(int info, Root left, Root right, Root root, int item, Root loc, Root par){
        if (root == right){
            loc = null;
            par = null;
            return;
        }

        if (info.Root == item){

        }
    }
*/

// Binary Search Tree
/*
// Binary Search Tree in Java

class BinarySearchTree {
    Node root;
    class Node {
        int key;
        Node left, right;
        public Node(int item) {
            key = item;
            left = right = null;
        }
    }
    BinarySearchTree() {
        root = null;
    }

    void insert(int key) {
        root = insertKey(root, key);
    }
    Node insertKey(Node root, int key) {
        // Return a new node if the tree is empty
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key)
            root.left = insertKey(root.left, key);
        else if (key > root.key)
            root.right = insertKey(root.right, key);

        return root;
    }

    void deleteKey(int key) {
        root = deleteRec(root, key);
    }
    Node deleteRec(Node root, int key) {
        // Return if the tree is empty
        if (root == null)
            return root;

        // Find the node to be deleted
        if (key < root.key)
            root.left = deleteRec(root.left, key);
        else if (key > root.key)
            root.right = deleteRec(root.right, key);
        else {
            // If the node is with only one child or no child
            if (root.left == null) {
                return root.right;
            }
            else if (root.right == null) {
                return root.left;
            }

            // If the node has two children, Place the inorder successor in position of the node to be deleted
            root = inOrderSuc(root.right);

            // Delete the inorder successor
            root.right = deleteRec(root.right, root.key);
        }
        return root;
    }

    // Find the inorder successor
    Node inOrderSuc(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    void inorder() {
        inorderRec(root);
    }
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " -> ");
            inorderRec(root.right);
        }
    }

    static Node search(Node root, int key){
        if (root == null || root.key == key){
            return root;
        }
        if (key > root.key){
            return search(root.right, key);
        }
        return search(root.left, key);
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(8);
        tree.insert(3);
        tree.insert(1);
        tree.insert(6);
        tree.insert(7);
        tree.insert(10);
        tree.insert(14);
        tree.insert(4);

        System.out.print("Inorder traversal: ");
        tree.inorder();

        System.out.println("\n\nAfter deleting 10");
        tree.deleteKey(10);
        System.out.print("Inorder traversal: ");
        tree.inorder();
    }
}
*/
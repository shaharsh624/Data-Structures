/*
import java.util.Scanner;

class Root{
    int key;
    Root left, right;

    public Root(int item){
        key = item;
        left = right = null;
    }
}

class PreOrderTree{
    Root root;

    // Traverse tree
    public void traverseTree(Root root){
        if (root != null){
            System.out.println(root.key);
            traverseTree(root.left);
            traverseTree(root.right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PreOrderTree tree = new PreOrderTree();
        System.out.print("Enter tree.root = ");
        tree.root = new Root(sc.nextInt());
        System.out.print("Enter tree.root.left = ");
        tree.root.left = new Root(sc.nextInt());
        System.out.print("Enter tree.root.right = ");
        tree.root.right = new Root(sc.nextInt());
        System.out.print("Enter tree.root.left.left = ");
        tree.root.left.left = new Root(sc.nextInt());

        tree.traverseTree(tree.root);
    }
}
*/
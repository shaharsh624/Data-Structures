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
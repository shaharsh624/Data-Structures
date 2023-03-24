class LinkedList {
    Node head;
    // Create Node
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Insert at beginning
    public void insertAtBeginning(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    // Insert after a node
    public void insertAfter(Node prev_node, int new_data){
        if (prev_node == null){
            System.out.println("The given previous node is null");
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }

    // Insert at End
    public void insertAtEnd(int new_data){
        Node new_node = new Node(new_data);
        if (head == null){
             head = new Node(new_data);
            return;
        }
        new_node.next = null;
        Node last = head;
        while(last.next != null){
            last = last.next;
            last.next = new_node;
            return;
        }
    }

    // Delete Node
    void deleteNode(int position) {
        if (head == null)
            return;
        Node temp = head;
        if (position == 0) {
            head = temp.next;
            return;
        }
        // Find the key to be deleted
        for (int i = 0; temp != null && i < position - 1; i++)
            temp = temp.next;
        // If the key is not present
        if (temp == null || temp.next == null)
            return;
        // Remove the node
        Node next = temp.next.next;
        temp.next = next;
    }

    // Print the linked list
    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }

    public static void main(String[] args) {
        LinkedList lst = new LinkedList();

        //lst.insertAtEnd(1);
        lst.insertAtBeginning(2);
        lst.insertAtBeginning(3);
        //lst.insertAtEnd(4);
        lst.insertAfter(lst.head.next, 5);

        System.out.println("Linked list: ");
        lst.printList();

        System.out.println("\nAfter deleting an element: ");
        lst.deleteNode(3);
        lst.printList();
    }
}
public class DoublyLinkedList {
    private Node head;

    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

        public Node(int val) {
            this.val = val;
        }
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.val == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null){
            head.prev = node;
        }
        head = node;
    }

    public void insert(int after, int val){
        Node p = find(after);
        if (p==null){
            System.out.println("Doesn't exist");
            return;
        }
        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next.prev != null){
            node.next.prev = node;
        }
    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        if (head == null){
            node.prev = null;
            head = node;
            return;
        }
        while(last.next != null) { //traverse
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }

    public void display(){
        Node node = head;
        Node last = null;
        System.out.print("Printing in Normal Order: ");
        if (head != null){
            do {
                System.out.print(node.val + " -> ");
                last = node;
                node = node.next;
            } while(node != null);
            System.out.println("null");
        }

        // Displaying in reverse order
        System.out.print("Printing in Reverse Order: ");
        while (last != null){
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("start");
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertFirst(23);
        list.insertFirst(56);
        list.insertFirst(89);
        list.insertLast(66);
        list.insert(89,78);
        list.display();
    }
}
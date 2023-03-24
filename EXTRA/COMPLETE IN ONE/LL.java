// LL
/*
public class LL{
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    public Node find(String value) {
        Node node = head;
        while (node != null) {
            if (node.data == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public void addFirst(String data){
        Node newNode = new Node(data);
        if (head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        if (head==null){
            head = newNode;
            return;
        }
        //traverse
        Node currNode = head;
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    public void addAfter(int loc, String new_data) {
        if (head == null) {
            return;
        }
        Node temp = head;
        if (loc == 0){
            head = temp.next;
            return;
        }
        int i=0;
        while(temp != null && i<loc-1){
            temp = temp.next;
            i++;
        }
        if(temp == null || temp.next == null){ //last
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next = temp.next;
        temp.next = new_node;
    }
    public void deleteFirst(){
        if (head==null){
            System.out.println("The list is empty");
            return;
        }
        head = head.next;
    }
    public void deleteLast(){
        if (head==null){
            System.out.println("The list is empty");
            return;
        }
        if (head.next == null){ //Single node only
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;

        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    public void deleteLoc(int loc){
        if (head == null){
            return;
        }
        Node temp = head;
        if (loc == 0){
            head = temp.next;
            return;
        }
        int i=0;
        while(temp != null && i<loc-1){
            temp = temp.next;
            i++;
        }
        if(temp == null || temp.next == null){ //last
            return;
        }
        Node next = temp.next.next;
        temp.next = next;
    }
    public void printList(){
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LL list  = new LL();

        list.addFirst("3");
        list.addFirst("2");
        list.addFirst("1");
        list.addLast("4");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        list.deleteLoc(2);
        list.printList();

        list.addLast("5");
        list.printList();

        list.addAfter(2,"4");
        list.printList();
    }
}
*/

// Programiz Code LL
/*
class LinkedList {
  Node head;

  // Create a node
  class Node {
    int data;
    Node next;

    Node(int d) {
      data = d;
      next = null;
    }
  }

  // Insert at the beginning
  public void insertAtBeginning(int new_data) {
    // insert the data
    Node new_node = new Node(new_data);
    new_node.next = head;
    head = new_node;
  }

  // Insert after a node
  public void insertAfter(Node prev_node, int new_data) {
    if (prev_node == null) {
      System.out.println("The given previous node cannot be null");
      return;
    }
    Node new_node = new Node(new_data);
    new_node.next = prev_node.next;
    prev_node.next = new_node;
  }

  // Insert at the end
  public void insertAtEnd(int new_data) {
    Node new_node = new Node(new_data);

    if (head == null) {
      head = new Node(new_data);
      return;
    }

    new_node.next = null;

    Node last = head;
    while (last.next != null)
      last = last.next;

    last.next = new_node;
    return;
  }

  // Delete a node
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

  // Search a node
  boolean search(Node head, int key) {
    Node current = head;
    while (current != null) {
      if (current.data == key)
        return true;
      current = current.next;
    }
    return false;
  }

  // Sort the linked list
  void sortLinkedList(Node head) {
    Node current = head;
    Node index = null;
    int temp;

    if (head == null) {
      return;
    } else {
      while (current != null) {
        // index points to the node next to current
        index = current.next;

        while (index != null) {
          if (current.data > index.data) {
            temp = current.data;
            current.data = index.data;
            index.data = temp;
          }
          index = index.next;
        }
        current = current.next;
      }
    }
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
    LinkedList llist = new LinkedList();

    llist.insertAtEnd(1);
    llist.insertAtBeginning(2);
    llist.insertAtBeginning(3);
    llist.insertAtEnd(4);
    llist.insertAfter(llist.head.next, 5);

    System.out.println("Linked list: ");
    llist.printList();

    System.out.println("\nAfter deleting an element: ");
    llist.deleteNode(3);
    llist.printList();

    System.out.println();
    int item_to_find = 3;
    if (llist.search(llist.head, item_to_find))
      System.out.println(item_to_find + " is found");
    else
      System.out.println(item_to_find + " is not found");

    llist.sortLinkedList(llist.head);
    System.out.println("\nSorted List: ");
    llist.printList();
  }
}
*/

// Doubly Linked List
/*
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
*/

// Circular Linked List
/*
public class CircularLinkedList {
    private Node head;
    private Node tail;

    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val){
        Node node = new Node(val);
        if (head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void delete(int val){
        Node node = head;
        if (node == null){
            return;
        }
        if (val == node.val){
            head = head.next;
            tail.next = head;
            return;
        }
        do{
            Node n = node.next;
            if (n.val == val){
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);
    }

    public void display(){
        Node node = head;
        if (head != null){
            do{
                System.out.print(node.val + " -> ");
                node = node.next;
            } while (node != head);
            System.out.println("head");
        }
    }

    public static void main(String[] args) {
        CircularLinkedList list  = new CircularLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.display();
        list.delete(4);
        list.display();

    }
}
*/

// Merge Sorted LL
/*
import java.util.Scanner;
class Node{
    int data;
    Node next;

    Node(){}
    Node(int data){
        this.data = data;
    }
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

}

public class MergeSortedList {
    Node head;

    public void addLast(Node node){
        if (head == null){
            head = node;
        }
        else{
            Node tempNode = head;
            while(tempNode.next != null){
                tempNode = tempNode.next;
            }
            tempNode.next = node;
        }
    }

    void printList() {
        System.out.print("\nMerged Linked list is :  ");
        Node tempNode = head;
        while(tempNode != null){
            System.out.print(tempNode.data + " -> ");
            tempNode = tempNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MergeSortedList msl1 = new MergeSortedList();
        MergeSortedList msl2 = new MergeSortedList();

        System.out.print("Enter number of elements for 1st List: ");
        int n1 = sc.nextInt();
        for (int i=0 ; i<n1 ; i++){
            System.out.print("Enter data: ");
            int data = sc.nextInt();
            msl1.addLast(new Node(data));
        }

        System.out.print("Enter number of elements for 2nd List: ");
        int n2 = sc.nextInt();
        for (int i=0 ; i<n2 ; i++){
            System.out.print("Enter data: ");
            int data = sc.nextInt();
            msl2.addLast(new Node(data));
        }


        msl1.head = new MergeList().mergeList(msl1.head, msl2.head);
        msl1.printList();


    }
}

class MergeList{
    public Node mergeList(Node A, Node B){
        if (A == null){
            return B;
        }
        if (B == null){
            return A;
        }
        if (A.data < B.data) {
            A.next = mergeList(A.next, B);
            return A;
        }
        else {
            B.next = mergeList(B.next, A);
            return B;
        }
    }
}
*/
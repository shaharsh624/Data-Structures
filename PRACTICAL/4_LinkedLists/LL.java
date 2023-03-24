// Programiz Code
/*
// Linked list operations in Java

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
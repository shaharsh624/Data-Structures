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
    }
}
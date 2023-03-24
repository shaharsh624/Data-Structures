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
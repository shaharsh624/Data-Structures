/*
// Java program to implement Priority Queue (7.3)

class item {
public int value;
public int priority;
};

class PriorityQueue {
    static item[] pr = new item[100000];
    static int size = -1;
    static void enqueue(int value, int priority) {
        size++;

        pr[size] = new item();
        pr[size].value = value;
        pr[size].priority = priority;
    }

    static void dequeue() {
        int ind = peek();

        for (int i = ind; i < size; i++) {
        pr[i] = pr[i + 1];
        }

        size--;
    }

    public static void main(String[] args) {
        enqueue(10, 2);
        enqueue(14, 4);
        enqueue(16, 4);
        enqueue(12, 3);


        System.out.println(pr[ind].value);
        dequeue();
        System.out.println(pr[ind].value);
        dequeue();
        System.out.println(pr[ind].value);
    }
}
*/
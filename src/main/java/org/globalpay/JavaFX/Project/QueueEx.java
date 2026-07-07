package org.globalpay.JavaFX.Project;

public class QueueEx {
    private int front = 0;
    private int rear = -1;
    private int size = 0;
    private int[] arr = new int[4];

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + data);
            return;
        }
        arr[++rear] = data;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        int data = arr[front++];
        size--;
        return data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == arr.length;
    }

    public void show() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void main() {
        QueueEx q = new QueueEx();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50); // should say full

        System.out.println("Queue contents:");
        q.show();

        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Dequeued: " + q.dequeue());

        System.out.println("Queue after dequeue:");
        q.show();

        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Dequeued: " + q.dequeue()); // should say empty
    }
}

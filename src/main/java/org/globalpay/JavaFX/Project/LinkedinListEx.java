package org.globalpay.JavaFX.Project;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
    }
}

public class LinkedinListEx {

    Node head = null;

    public void add(int data){
        Node newNode = new Node(data);

        Node current = head;
        if (head == null)
            head = newNode;
        else {
            while (current.next != null)
                current = current.next;
            current.next = newNode;
        }
    }

    static void main() {
        LinkedinListEx nums = new LinkedinListEx();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        nums.addFirst(10);
        nums.addFirst(201);

        nums.delete(1);
        nums.printValue();

    }

    private void delete(int data) {
        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    private void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    private void printValue() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

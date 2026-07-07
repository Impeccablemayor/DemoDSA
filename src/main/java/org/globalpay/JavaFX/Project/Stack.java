package org.globalpay.JavaFX.Project;

public class Stack {

    int[] arr = new int[5];
    int size;
    int top;

    public Stack() {
        size = arr.length;
        top = -1;
    }

    public void push(int data) {
        if(top<size){
            arr[++top] = data;
        }
        else{
            System.out.println("Stack Overflow");
        }
    }

    static void main() {
        Stack nums = new Stack();
        nums.push(2);
        nums.push(62);
        nums.push(12);
        nums.push(22);
        nums.push(220);

        System.out.println(nums.pop());
        System.out.println(nums.peek()); // it just peeks and not delete
        nums.printStack();

    }

    private int pop() {
        if(top>-1)
            return arr[top--];
        else
            System.out.println("Stack Underflow");
        return 0;
    }

    private int peek() {
        return arr[top];
    }

    private void printStack() {
        for( int n : arr) {
            System.out.print(n + " ");
        }
    }
}

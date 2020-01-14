package ds.stack;

import java.util.EmptyStackException;

public class Stack<E> {
    private int maxSize;
    private E[] stackArray;
    private int top;

    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = (E[]) new Object[size];
        this.top = -1;
    }

    public void push(E j) {
        if(isFull()) {
            throw new RuntimeException("This stack is full!");
        } else {
            top++;
            stackArray[top] = j;
        }
    }

    public E pop() {
        if(isEmpty()) {
            throw new RuntimeException("This stack is empty!");
        } else {
            int old_top = top;
            top--;
            return stackArray[old_top];
        }
    }

    public E peak() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (maxSize -1 == top);
    }
}
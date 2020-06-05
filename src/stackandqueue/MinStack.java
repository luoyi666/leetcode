package stackandqueue;

import java.util.LinkedList;
import java.util.Stack;

public class MinStack {
    Stack<Integer> dataStack;
    Stack<Integer> minStack;
    int min = Integer.MAX_VALUE;

    /** initialize your data structure here. */
    public MinStack() {
        dataStack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }

    public void push(int x) {
        dataStack.push(x);
        min = x < min ? x: min;
        minStack.push(min);
    }

    public void pop() {
        dataStack.pop();
        minStack.pop();
        min = minStack.isEmpty() ? Integer.MAX_VALUE : minStack.peek();
    }

    public int top() {
        return dataStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

package stackandqueue;

import java.util.Stack;

public class MyQueue {
    Stack in;
    Stack out;
    /** Initialize your data structure here. */
    public MyQueue() {
        in = new Stack();
        out = new Stack();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        in.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while (!in.isEmpty()) {
            out.push(in.pop());
        }
        int result = (int) out.pop();
        while (!out.isEmpty()) {
            in.push(out.pop());
        }
        return result;
    }

    /** Get the front element. */
    public int peek() {
        while (!in.isEmpty()) {
            out.push(in.pop());
        }
        int result = (int) out.peek();
        while (!out.isEmpty()) {
            in.push(out.pop());
        }
        return result;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return in.isEmpty();
    }
}

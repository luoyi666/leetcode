package stackandqueue;

import java.util.LinkedList;

public class MyStack {
    LinkedList<Integer> in;
    LinkedList<Integer> out;
    /** Initialize your data structure here. */
    public MyStack() {
        in = new LinkedList<Integer>();
        out = new LinkedList<Integer>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        in.push(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while (in.size() > 1) {
            out.push(in.pop());
        }
        int result = in.pop();
        while (out.size() > 0) {
            in.push(out.pop());
        }
        return result;
    }

    /** Get the top element. */
    public int top() {
        int result = 0;
        while (in.size() != 0) {
            if (in.size() == 1) {
                result = in.peek();
            }
            out.push(in.pop());
        }

        while (out.size() > 0) {
            in.push(out.pop());
        }
        return result;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return in.isEmpty();
    }
}

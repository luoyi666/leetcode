package stackandqueue;

import java.util.Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] T) {
        int n = T.length;
        Stack<Integer> indexs = new Stack<Integer>();
        int[] dist = new int[n];
        for (int i = 0; i < T.length; i++) {
            while (!indexs.isEmpty() && T[i] > indexs.peek()) {
                int peek = indexs.pop();
                dist[peek] = i - peek;
            }
            indexs.add(i);
        }
        return dist;
    }
}

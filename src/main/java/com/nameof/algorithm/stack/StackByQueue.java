package com.nameof.algorithm.stack;

import java.util.LinkedList;

public class StackByQueue {
    LinkedList<Integer> queue = new LinkedList<>();

    public void push(Integer data) {
        queue.addLast(data);
    }

    public Integer pop() {
        if (queue.isEmpty()) {
            return -1;
        }
        int size = queue.size();
        while (size-- > 1) {
            queue.addLast(queue.removeFirst());
        }
        return queue.removeFirst();
    }
}

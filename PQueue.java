package Heaps;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class PQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.add(70);
        queue.add(60);
        queue.add(55);
        queue.add(45);
        queue.add(50);
        queue.add(65);

        System.out.println(queue);
    }
}

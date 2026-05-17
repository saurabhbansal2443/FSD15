package Heap;

import java.util.*;

public class Basics {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(20);
        pq.add(16);
        pq.add(1);
        pq.add(4);
        pq.add(3);
        pq.add(99);

        System.out.println(pq.peek());
        System.out.println(pq.remove());
        System.out.println(pq.peek());

    }
}

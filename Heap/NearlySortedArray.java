package Heap;

import java.util.PriorityQueue;

public class NearlySortedArray {
    class Solution {
        public void nearlySorted(int[] arr, int k) {

            PriorityQueue<Integer> pq = new PriorityQueue<>();
            int e = 0;
            int kth = k;
            while (k >= 0) {
                pq.add(arr[e]);
                k--;
                e++;
            }
            int itr = kth + 1;
            for (int i = 0; i < arr.length; i++) {
                int ele = pq.remove();
                arr[i] = ele;

                if (itr < arr.length) {
                    pq.add(arr[itr]);
                    itr++;
                }
            }

        }
    }

}

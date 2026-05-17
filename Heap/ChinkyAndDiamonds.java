package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class ChinkyAndDiamonds {
    class Solution {
    public long maxDiamonds(int[] arr, int k) {
       
        long ans = 0 ; 
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); 
        
        for(int i=0 ; i<arr.length ; i++){
            pq.add(arr[i]); 
        }
        
        while(k>0){
            int diamonds = pq.remove(); 
            ans += (long) diamonds; 
            pq.add(diamonds/2); 
            k--; 
        }
        return ans ; 
    }
}

}

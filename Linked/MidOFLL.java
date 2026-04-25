public class MidOFLL {
    
}
/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    int getMiddle(Node head) {
        // code here
        if(head.next == null){
            return head.data ; 
        }
        
        Node fast = head ; 
        Node slow = head ; 
        
        while(fast!=null && fast.next != null){
            fast = fast.next.next ; 
            slow = slow.next ; 
        }
        
        return slow.data; 
    }
}
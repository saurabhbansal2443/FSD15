public class EndNodeFromLast {
    
}
/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {
    int getKthFromLast(Node head, int k) {
       
        Node fast= head ; 
        Node slow = head  ;
        
        while(k>0 && fast!=null){
            fast = fast.next ; 
            k--; 
        }
        
        if(fast == null && k>0 ){
          return -1 ;   
        }
        
        while(fast!= null ){
            fast = fast.next ; 
            slow = slow.next ; 
        }
        
        return slow.data; 
    }
}
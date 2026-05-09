public class RemoveCycle {
    
}
/*
class Node
{
    int data;
    Node next;
}
*/

class Solution {
    public static void removeLoop(Node head) {
        // code here
        if(head == null || head.next == null ) return ; 
        
        Node fast = head ; 
        Node slow = head ; 
        
        while(fast!= null && fast.next != null ){
            fast = fast.next.next ; 
            slow = slow.next ; 
            
            if(fast == slow){ // cycle 
                Node ptr = head ; 
              
              
              while(ptr != slow){
                  ptr = ptr.next ; 
                  slow = slow.next ; 
              }
              
             
              
              while(slow != ptr.next ){
                  ptr = ptr.next ; 
              }
              
              ptr.next = null ; 
                
                
            
            }
        }
    }
}
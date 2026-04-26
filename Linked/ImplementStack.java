import org.w3c.dom.Node;

public class ImplementStack {
    // Node class
/* class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
} */

// Stack class
class myStack {
    
    private Node head ; 
    private int size ; 

    public myStack() {
      this.head = null ; 
      this.size = 0 ; // Initialize your data members
    }

    public boolean isEmpty() {
       if(this.size == 0 ){
           return true ; 
       }else{
           return false ; 
       }
    }

    public void push(int x) {
        Node n = new Node(x); 
        
        if(this.head == null ){
            this.head = n ; 
        }else{
            n.next = this.head ; 
            this.head = n ;  
        }
        this.size++; 
    }

    public void pop() {
       if(this.head == null ){
           return ; 
       }
       this.head = this.head.next ; 
       this.size--;
       return ; 
    }

    public int peek() {
         if(this.head == null ){
           return -1; 
       }else{
           return head.data ; 
       }
    }

    public int size() {
        
        return this.size; 
        // Returns the current size of the stack.
    }
}

}

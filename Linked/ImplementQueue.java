import org.w3c.dom.Node;

public class ImplementQueue {
    // Node class
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

// Queue class
class myQueue {
    
    private Node head; 
    private Node tail ; 
    private int size ; 

    public myQueue() {
        
        this.head = null ; 
        this.tail = null; 
        this.size = 0 ; 
        // Initialize your data members
    }

    public boolean isEmpty() {
        return this.size == 0 ? true : false ; 
        // check if the queue is empty
    }

    public void enqueue(int x) {
        Node n = new Node(x); 
        
        if(this.tail == null ){
            this.tail = n ; 
            this.head = n ; 
        }else {
            this.tail.next = n ; 
            this.tail = n ; 
        }
        this.size++; 
        
    }

    public void dequeue() {
       if(this.head == null ){
           return; 
        }else if (this.head.next == null ) {
            this.head = null ; 
            this.tail = null ; 
        }else {
            this.head = this.head.next ; 
            
        }
         this.size--; 
    }

    public int getFront() {
         if(this.head == null ){
           return -1; 
        }else {
            return this.head.data ; 
            
        }
      
    }

    public int size() {
      return this.size; 
    }
}

}

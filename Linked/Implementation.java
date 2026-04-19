
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    Node tail;
    int size;

    LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void addFirst(int val) {
        Node n = new Node(val);

        if (head == null) { // size is 0 and the list is empty
            this.head = n;
            this.tail = n;
            this.size = 1;\
            return;
        } else {
            n.next = this.head;
            this.head = n;
            this.size++;
        }
    }

    public void addLast(int val) {
        Node n = new Node(val);

        if (head == null) { // size is 0 and the list is empty
            this.head = n;
            this.tail = n;
            this.size = 1;
            return;
        } else {
            this.tail.next = n;
            this.tail = n;
            this.size++;
        }
    }

    public void addAtIndex(int val, int idx) {
        if (idx < 0 || idx > size) {
            System.out.println("Invalid index ");
        } else if (idx == 0) {
            this.addFirst(val);
        } else if (idx == size) {
            this.addLast(val);
        } else {
            Node n = new Node(val);
            Node ptr = this.head;

            while (idx > 1) {
                ptr = ptr.next;
                idx--;
            }

            Node nbr = ptr.next;
            ptr.next = n;
            n.next = nbr;
            size++;
        }
    }

    public void print() {
        Node ptr = this.head;

        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
    }

    public int getFirst() {
        if (head == null) {
            return -1;
        } else {
            return head.data;
        }
    }

    public int getLast() {
        if (tail == null) {
            return -1;
        } else {
            return tail.data;
        }
    }

    public int getAtIndex(int idx) {
        if (idx < 0 || idx >= size) {
            return -1;
        } else if (idx == 0) {
            return getFirst();
        } else if (idx == size - 1) {
            return getLast();
        } else {
            Node ptr = this.head;
            while (idx > 0) {
                ptr = ptr.next;
                idx--;
            }

            return ptr.data;
        }
    }

    public int removeFirst() {
        if (this.head == null) {
            return -1;
        } else {
            int data = this.head.data;
            this.head = this.head.next;
            this.size--;
            return data;
        }
    }

    public int removeLast() {
        if (this.head == null) {
            return -1;
        } else {
            Node ptr = this.head;
            while (ptr.next != this.tail) {
                ptr = ptr.next;
            }
            int data = this.tail.data;
            ptr.next = null;
            this.tail = ptr;
            this.size--;
            return data;
        }
    }

    public int removeAtIndex(int idx ){
        if(idx< 0 && idx>= size ){
            return -1 ; 
        }else if ( idx == 0 ){
            return removeFirst()
        }else if ( idx == size -1 ){
            return removeLast(); 
        }else{
            Node ptr = this.head ; 
            while(idx>1 ){
                ptr = ptr.next ; 
                idx--; 
            }
            this.ptr.next = this.ptr.next.next ; 
            this.size--; 
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addFirst(10);
        list.addFirst(20);
        list.addLast(30);
        list.addAtIndex(99, 1);

        list.print();
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    Node tail;
    int size;

    LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void addFirst(int val) {
        Node n = new Node(val);

        if (head == null) { // size is 0 and the list is empty
            this.head = n;
            this.tail = n;
            this.size = 1;\
            return;
        } else {
            n.next = this.head;
            this.head = n;
            this.size++;
        }
    }

    public void addLast(int val) {
        Node n = new Node(val);

        if (head == null) { // size is 0 and the list is empty
            this.head = n;
            this.tail = n;
            this.size = 1;
            return;
        } else {
            this.tail.next = n;
            this.tail = n;
            this.size++;
        }
    }

    public void addAtIndex(int val, int idx) {
        if (idx < 0 || idx > size) {
            System.out.println("Invalid index ");
        } else if (idx == 0) {
            this.addFirst(val);
        } else if (idx == size) {
            this.addLast(val);
        } else {
            Node n = new Node(val);
            Node ptr = this.head;

            while (idx > 1) {
                ptr = ptr.next;
                idx--;
            }

            Node nbr = ptr.next;
            ptr.next = n;
            n.next = nbr;
            size++;
        }
    }

    public void print() {
        Node ptr = this.head;

        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
    }

    public int getFirst() {
        if (head == null) {
            return -1;
        } else {
            return head.data;
        }
    }

    public int getLast() {
        if (tail == null) {
            return -1;
        } else {
            return tail.data;
        }
    }

    public int getAtIndex(int idx) {
        if (idx < 0 || idx >= size) {
            return -1;
        } else if (idx == 0) {
            return getFirst();
        } else if (idx == size - 1) {
            return getLast();
        } else {
            Node ptr = this.head;
            while (idx > 0) {
                ptr = ptr.next;
                idx--;
            }

            return ptr.data;
        }
    }

    public int removeFirst() {
        if (this.head == null) {
            return -1;
        } else {
            int data = this.head.data;
            this.head = this.head.next;
            this.size--;
            return data;
        }
    }

    public int removeLast() {
        if (this.head == null) {
            return -1;
        } else {
            Node ptr = this.head;
            while (ptr.next != this.tail) {
                ptr = ptr.next;
            }
            int data = this.tail.data;
            ptr.next = null;
            this.tail = ptr;
            this.size--;
            return data;
        }
    }

    public int removeAtIndex(int idx ){
        if(idx< 0 && idx>= size ){
            return -1 ; 
        }else if ( idx == 0 ){
            return removeFirst()
        }else if ( idx == size -1 ){
            return removeLast(); 
        }else{
            Node ptr = this.head ; 
            while(idx>1 ){
                ptr = ptr.next ; 
                idx--; 
            }
            this.ptr.next = this.ptr.next.next ; 
            this.size--; 
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addFirst(10);
        list.addFirst(20);
        list.addLast(30);
        list.addAtIndex(99, 1);

        list.print();
    }
}

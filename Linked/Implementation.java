package Linked;

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

    public static void addFirst(int val) {
        Node n = new Node(val);

        if (head == null) { // size is 0 and the list is empty
            this.head = n;
            this.tail = n;
            this.size = 1;
            return;
        } else {
            n.next = this.head;
            this.head = n;
            this.size++;
        }
    }

    public static void addLast(int val) {
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
}

public class Implementation {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
    }
}

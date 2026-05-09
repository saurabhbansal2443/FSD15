package Queue;

class DynamicQueue {
    private int[] arr;
    private int size;

    DynamicQueue() {
        this.arr = new int[10];
        this.size = 0;
    }

    DynamicQueue(int size) {
        this.arr = new int[size];
        this.size = 0;
    }

    public void add(int ele) {
        int n = this.arr.length;
        if (this.size == n) {
            int[] narr = new int[n * 2];
            for (int i = 0; i < n; i++) {
                narr[i] = arr[i];
            }
            this.arr = narr;
        }
        this.arr[size] = ele;
        this.size++;

    }

    public int remove() {
        if (this.size == 0) {
            return -1;
        }
        int ele = this.arr[0];

        for (int i = 1; i < this.arr.length; i++) {
            arr[i - 1] = arr[i];
        }

        this.size--;

        return ele;

    }

    public int getStart() {
        if (this.size == 0) {
            return -1;
        }
        int ele = this.arr[0];
        return ele;
    }

    public int getSize() {
        return this.size;
    }
}

public class implement {
    public static void main(String[] args) {

    }
}

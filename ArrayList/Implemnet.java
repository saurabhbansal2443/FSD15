

class CustomArrayList {

    private int[] arr;
    private int size;

    CustomArrayList() {
        this.arr = new int[10];
        this.size = 0;
    }

    CustomArrayList(int size) {
        this.arr = new int[size];
        this.size = 0;
    }

    public void addFirst(int val) {
        if (this.size == 0) {
            this.arr[0] = val;
            size++;
        }
    }
}

public class Index {
    public static void main(String[] args) {

    }
}

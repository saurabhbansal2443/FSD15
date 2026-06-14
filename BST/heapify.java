
import java.util.*;





















class CustomHeap {

    private ArrayList<Integer> list;

    CustomHeap() {
        list = new ArrayList<>();
    }

    public void add(int ele) {

        if (list.size() == 0) {
            list.add(ele);
            return;
        }
        list.add(ele);

        upHeapify(list.size() - 1);

    }

    private void upHeapify(int idx) {
        if (idx == 0) {
            return;
        }
        int pIdx = (idx - 1) / 2;

        if (list.get(pIdx) > list.get(idx)) {
            swap(pIdx, idx);
            upHeapify(pIdx);
        }

    }

    private void swap(int idx1, int idx2) {
        int k = list.get(idx1);
        int l = list.get(idx2);
        list.add(idx2, k);
        list.add(idx1, l);
    }

    public int remove() {
        if (list.size() == 0) {
            return -1;
        } else if (list.size() == 1) {
            return list.removeLast();
        }
        int ans = list.get(0);
        swap(0, list.size() - 1);
        list.removeLast();
        dowheapify(0);
        return ans;
    }

    private void dowheapify(int idx) {

        int minIdx = idx;

        int lcIdx = idx * 2 + 1;
        int rcIdx = idx * 2 + 2;

        if (lcIdx < list.size() && list.get(lcIdx) < list.get(minIdx)) {
            minIdx = lcIdx;
        }
        if (rcIdx < list.size() && list.get(rcIdx) < list.get(minIdx)) {
            minIdx = rcIdx;
        }

        if (minIdx == idx) {
            return;
        } else {
            swap(minIdx, idx);
            dowheapify(minIdx);
        }

    }

    public int peek() {
        if (list.size() == 0) {
            return -1;
        }
        return list.get(0);
    }

    public int siz5e() {
        return list.size();
    }

    public void print() {
        System.out.println(list);
    }

}

public class ImplementHeap {
    public static void main(String[] args) {
        CustomHeap h = new CustomHeap();

        h.add(10);
        h.add(30);
        h.add(0);
        h.add(5);

        h.print();

        System.out.println(h.peek());
        System.out.println(h.remove());
        
        System.out.println(h.peek());
    }
}

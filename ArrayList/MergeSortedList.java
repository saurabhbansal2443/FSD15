package ArrayList;

import java.util.ArrayList;

public class MergeSortedList {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 4, 6, 7, 9, 10 };

        ArrayList<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list1.add(arr[i]);
        }
        int[] arr2 = { 1, 4, 6, 7, 10, 12 };

        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < arr2.length; i++) {
            list2.add(arr2[i]);
        }

        int p1 = 0;
        int p2 = 0;

        ArrayList<Integer> list3 = new ArrayList<>();

        while (p1 < list1.size() || p2 < list2.size()) {
            int ele1 = p1 < list1.size() ? list1.get(p1) : Integer.MAX_VALUE;
            int ele2 = p2 < list2.size() ? list2.get(p2) : Integer.MAX_VALUE;

            if (ele1 < ele2) {
                list3.add(ele1);
                p1++;
            } else {
                list3.add(ele2);
                p2++;
                ;
            }
        }

        System.out.println(list3);
    }
}

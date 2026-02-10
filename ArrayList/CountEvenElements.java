package ArrayList;

import java.util.*;

public class CountEvenElements {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 45, 70, 80, 90, 100 };

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        // int count = 0;

        // for (int i = 0; i < list.size(); i++) {
        // int ele = list.get(i);

        // if (ele % 2 == 0) {
        // count++;
        // }
        // }

        // System.out.println(count);

        // System.out.println(list.contains(110));

        boolean flag = true;

        for (int i = 1; i < list.size(); i++) {
            int pre = list.get(i - 1);
            int curr = list.get(i);

            if (pre > curr) {
                flag = false;
                break;
            }
        }

        System.out.println(flag);

    }
}

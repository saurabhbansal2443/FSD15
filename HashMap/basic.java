package HashMap;

import java.util.HashMap;

public class basic {
    public static void main(String[] args) {

        int[] arr = { 1, 3, 3, 1, 2, 7, 1, 6, 0, 7, 9 };

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int ele : arr) {

            if (hm.containsKey(ele)) {
                hm.put(ele, hm.get(ele) + 1);
            } else {
                hm.put(ele, 1);
            }
        }
        int max = 0;
        for (int key : hm.keySet()) {
            max = Math.max(max, hm.get(key));
        }

        System.out.println(max);

    }
}

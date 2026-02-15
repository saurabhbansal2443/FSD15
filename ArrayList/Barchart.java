package ArrayList;

import java.util.ArrayList;

public class Barchart {
    public static void main(String[] args) {
        int[] arr = { 5, 1, 0, 3, 1, 2, 7 };

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        int maxRow = 0;

        for (int i = 0; i < list.size(); i++) {
            if (maxRow < list.get(i)) {
                maxRow = list.get(i);
            }
        }

        for (int r = maxRow; r > 0; r--) {

            for (int c = 0; c < list.size(); c++) {
                int h = list.get(c);
                if (r <= h) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}

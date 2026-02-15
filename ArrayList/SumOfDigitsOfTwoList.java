package ArrayList;

import java.util.ArrayList;

public class SumOfDigitsOfTwoList {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 4, 6, 7, 9 };

        ArrayList<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list1.add(arr[i]);
        }
        int[] arr2 = { 1, 4, 6, 7 };

        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < arr2.length; i++) {
            list2.add(arr2[i]);
        }

        ArrayList<Integer> list3 = new ArrayList<>();

        // int maxLength = list1.size() > list2.size() ? list1.size() : list2.size();

        int ptr1 = list1.size() - 1;
        int ptr2 = list2.size() - 1;

        int carry = 0;

        while (ptr1 >= 0 || ptr2 >= 0) {
            int ele1 = ptr1 >= 0 ? list1.get(ptr1) : 0;
            int ele2 = ptr2 >= 0 ? list2.get(ptr2) : 0;

            int sum = ele1 + ele2 + carry;
            int d = sum % 10;
            carry = sum / 10;
            list3.add(0, d);
            ptr1--;
            ptr2--;
        }

        if (carry > 0) {
            list3.add(0, carry);
        }

        System.out.println(list3);

    }
}

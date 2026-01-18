package String;

public class StringTheory {
    public static void main(String[] args) {
        // int[] arr1 = { 1, 2 };
        // int[] arr2 = { 1, 2 };

        // System.out.println(arr1 == arr2); // false

        String str1 = "SAURABH"; // String pool
        String str2 = "SAURABH";

        String str3 = new String("SAURABH");
        String str4 = new String("SAURABH");

        System.out.println(str1 == str2); // true --> because the string is made in string pool and shares the same
                                          // same address

        System.out.println(str1 == str3);// false because the str1 is in pool and str3 is in heap so adress is diffrent

        System.out.println(str3 == str4); // false because the adddres are diffrent in heap

        System.out.println(str1.equals(str3));

    }
}

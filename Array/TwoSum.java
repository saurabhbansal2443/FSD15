package Array;

public class TwoSum {
    public static void main(String[] args) {

    }

    // https://leetcode.com/problems/two-sum/
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int ele1 = nums[i];

            for (int j = i + 1; j < nums.length; j++) {
                int ele2 = nums[j];

                if (ele1 + ele2 == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }

        }
        return ans;
    }
}

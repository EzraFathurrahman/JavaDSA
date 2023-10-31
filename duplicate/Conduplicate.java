package JavaDSA.duplicate;

import java.util.Arrays;

class Solution {
    public boolean dups(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        if (nums.length == 1) {
            return false;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }

        return false;
    }

}

public class Conduplicate {
    public static void main(String[] args) {

        Solution result = new Solution();
        int[] nums = { 1, 2, 3, 4,1 };
        System.out.println(result.dups(nums));

    }

}

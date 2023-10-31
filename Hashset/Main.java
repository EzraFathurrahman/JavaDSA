package JavaDSA.Hashset;

import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {

        HashSet<Integer> nums = new HashSet<>();
        int result = 0;
        int noResult = -1;
        if (A != null) {
            for (int i : A) {

                if (nums.contains(i)) {
                    nums.remove(i);
                    continue;
                }
                nums.add(i);
            }
            if (nums.isEmpty() == false) {
                Integer[] arr = new Integer[nums.size()];
                nums.toArray(arr);
                Integer lastEl = arr[arr.length - 1];
                System.out.println(lastEl);
                ;
            }

        }
        return noResult;

    }
}

public class Main {
    public static void main(String[] args) {
        int[] arrays = { 4, 10, 4, 10, 5, 2 };
        Solution numbers = new Solution();
        numbers.solution(arrays);
    }
}

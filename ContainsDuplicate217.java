package com.leetcode.y191119;

import java.util.Arrays;

public class ContainsDuplicate217 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        Solution217 solution217 = new Solution217();
        System.out.println(solution217.containsDuplicate(nums));

    }

}

class Solution217{
    public boolean containsDuplicate(int[] nums){
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}

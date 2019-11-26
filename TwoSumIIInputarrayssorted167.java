package com.leetcode.y191126;

import java.util.Arrays;

public class TwoSumIIInputarrayssorted167 {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        Solution167 solution167 = new Solution167();
        System.out.println(Arrays.toString(solution167.twoSum(numbers,target)));

    }
}

class Solution167 {
    public int[] twoSum(int[] numbers, int target) {
        int[] res=new int[2];
        int low=0;
        int high=numbers.length-1;
        while(low<high)
        {
            if(numbers[low]+numbers[high]>target)
                high--;
            if(numbers[low]+numbers[high]<target)
                low++;
            if(numbers[low]+numbers[high]==target)
            {
                res[0]=low+1;
                res[1]=high+1;
                return res;
            }
        }
        return res;
    }
}

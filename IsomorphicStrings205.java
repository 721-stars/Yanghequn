package com.leetcode.y191119;


public class IsomorphicStrings205 {
    public static void main(String[] args) {
        Solution205 solution205 = new Solution205();
        String s = "egg";
        String t = "ade";
        System.out.println(solution205.isIsomorphic(s,t));


    }

}

class Solution205 {
    public boolean isIsomorphic (String s, String t) {
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(ch1[i]) != t.indexOf(ch2[i])) return false;
        }
        return true;
    }
}

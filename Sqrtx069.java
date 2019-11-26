package com.leetcode.y191126;

public class Sqrtx069 {
    public static void main(String[] args) {
        Solution069 solution069 = new Solution069();
        System.out.println(solution069.mySqrt(9));

    }
}

class Solution069 {
    int s;

    public int mySqrt(int x) {
        s = x;
        if(x == 0) return 0;
        return ((int)(sqrts(x)));
    }

    public double sqrts(double x){
        double res = (x + s / x) / 2;
        if (res == x) {
            return x;
        } else {
            return sqrts(res);
        }
    }
}

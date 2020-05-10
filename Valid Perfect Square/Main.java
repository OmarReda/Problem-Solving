
/** --------------------
      LeetCode Problem
    -------------------- **/
    
/*************************************************************
 Problem Statement
 ------------------
Given a positive integer num, write a function which returns
True if num is a perfect square else False.

Note: Do not use any built-in library function such as sqrt.
 ************************************************************/
/**********************************
Input: 16
Output: true

Input: 14
Output: false
***********************************/

class Solution {
    public boolean isPerfectSquare(int num) {
        long sum = 0;
        for (int i = 1; sum < num; i = i + 2) {
            sum = sum + i;
            if (sum == num) {
                return true;
            }
        }
        return false;
    }
}

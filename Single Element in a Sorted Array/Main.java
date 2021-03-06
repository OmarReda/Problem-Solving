/** --------------------
      LeetCode Problem
    -------------------- **/
    
/*************************************************************
 Problem Statement
 ------------------
You are given a sorted array consisting of only integers
where every element appears exactly twice, except for one
element which appears exactly once.

Find this single element that appears only once.

Note: Your solution should run in O(log n) time and O(1) space.
 ************************************************************/
/**********************************
Input: [1,1,2,3,3,4,4,8,8]
Output: 2

Input: [3,3,7,7,10,11,11]
Output: 10
***********************************/
class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int n = nums.length;
        if (n == 1) 
            return nums[0];
        
        for (int i=0,j=1;i<n-1;i+=2){
            if (nums[i]!=nums[j]){
                return nums[i];
            }
            j+=2;
        }
        return nums[n-1];
        
    }
}
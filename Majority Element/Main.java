/** --------------------
      LeetCode Problem
    -------------------- **/
    
/*****************************************************
 Problem Statement
 ------------------
Given an array of size n, find the majority element.
The majority element is the element that appears 
more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and 
the majority element always exist in the array.
******************************************************/

/************************************
Input: [3,2,3]
Output: 3
Input: [2,2,1,1,1,2,2]
Output: 2
************************************/

class Solution {
    public int majorityElement(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        Arrays.sort(nums);

        int previous = nums[0];
        int popular = nums[0];
        int count = 1;
        int maxCount = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == previous)
                count++;
            else {
                if (count > maxCount) {
                    popular = nums[i-1];
                    maxCount = count;
                }
                previous = nums[i];
                count = 1;
            }
        }
        return count > maxCount ? nums[nums.length-1] : popular;
    }
}
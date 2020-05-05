/** --------------------
      LeetCode Problem
    -------------------- **/
/**********************************************************
 Problem Statement
------------------
Given a string, find the first non-repeating character
in it and return it's index.If it doesn't exist, return -1.
**********************************************************/
/******************
s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
******************/

class Solution {
        
    public int firstUniqChar(String s) {
        
    HashMap < Character, Integer > map = new HashMap < > ();
    for (int i = 0; i < s.length(); ++i) {
        char chr = s.charAt(i);
        map.put(chr, map.containsKey(chr) ? map.get(chr) + 1 : 1);
    }
        
    for (int i = 0; i < s.length(); ++i) {
        if (map.get(s.charAt(i)) < 2) {
            return i;
       }
    }
      return -1;
    }
}
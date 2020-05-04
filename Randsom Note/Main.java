
/** --------------------
      LeetCode Problem
    -------------------- **/
    
/*******************************************************************
 Problem Statement
 ------------------
 Given an arbitrary ransom note string and another string
 containing letters from all the magazines, 
 write a function that will return true 
 if the ransom note can be constructed from the magazines;
 otherwise, it will return false.

 Each letter in the magazine string can only be used
 once in your ransom note.

 Note:
 You may assume that both strings contain only lowercase letters.
 *******************************************************************/
/**********************************
 canConstruct("a", "b") -> false
 canConstruct("aa", "ab") -> false
 canConstruct("aa", "aab") -> true
***********************************/


class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[256]; 
        char []str3 = magazine.toCharArray(); 
        for (int i = 0; i < str3.length; i++) 
            count[str3[i]]++; 
   
        // Now traverse through str2 to check 
        // if every character has enough counts 
          
        char []str4 = ransomNote.toCharArray(); 
        for (int i = 0; i < str4.length; i++) { 
            if (count[str4[i]] == 0) 
                return false; 
            count[str4[i]]--; 
        } 
        return true; 
    }
}
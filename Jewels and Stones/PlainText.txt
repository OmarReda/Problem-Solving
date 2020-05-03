/** --------------------
      LeetCode Problem
    -------------------- **/
    
/**************************************************************************************
 Problem Statement
 ------------------
 You're given strings J representing the types of stones that are jewels,
 and S representing the stones you have.  
 Each character in S is a type of stone you have.
 You want to know how many of the stones you have are also jewels.

 The letters in J are guaranteed distinct,
 and all characters in J and S are letters. 
 Letters are case sensitive, so "a" is considered a different type of stone from "A".
 
 => S and J will consist of letters and have length at most 50.
 => The characters in J are distinct.
***************************************************************************************/

/************************************
Input: J = "aA", S = "aAAbbbb"
Output: 3

Input: J = "z", S = "ZZ"
Output: 0
************************************/

class Solution {
    public int numJewelsInStones(String J, String S) {
        int counter = 0;
        String[] arrayJ = J.split("");
        String[] arrayS = S.split("");

        for(int k=0; k<J.length(); k++){
            for (int i = 0; i < S.length(); i++){
                char y = S.charAt(i);
                char x = J.charAt(k);
                if(x==y){
                    counter++;
                }
            }
        }
        return counter;
    }
}
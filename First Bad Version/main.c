/** --------------------
      LeetCode Problem
    -------------------- **/
/***********************************************************************************************************
Problem Statement
------------------
You are a product manager and currently leading a team to develop a new product.
Unfortunately, the latest version of your product fails the quality check.
Since each version is developed based on the previous version,
all the versions after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one,
which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which will return whether version is bad.
Implement a function to find the first bad version. You should minimize the number of calls to the API.
************************************************************************************************************/

/*******************************************************
Given n = 5, and version = 4 is the first bad version.

call isBadVersion(3) -> false
call isBadVersion(5) -> true
call isBadVersion(4) -> true

Then 4 is the first bad version.
********************************************************/

int firstBadVersion(int n) {
    int i = 1;
    int Bad = 0;
    if(n < 10000){
    for(i = 1; i <= n ; i++){
        if(isBadVersion(i) == true){
            Bad = i;
            break;
        }
    }
    }else {
    for(i = n; i <= n ; i--){
        if(isBadVersion(i) == false){
            Bad = i+1;
            break;
        }
    }
    }
    printf("%d is the first bad version", Bad);
    return Bad;
}

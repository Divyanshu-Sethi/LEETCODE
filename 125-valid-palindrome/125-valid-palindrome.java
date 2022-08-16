class Solution {
// Time - O(n)
// Space - O(1)
public boolean isPalindrome(String s) {

    // two pointers - start at beginning and end 
    int left = 0, right = s.length() - 1; 
    
    s = s.toLowerCase(); // set string to lowercase
    
    while(left < right) {
        
        // find valid left character
        while(left < right && !Character.isLetterOrDigit(s.charAt(left))) {
            left++; // keep moving (increment) until we find a valid left char
        }
        // found valid left character now
        
        // find valid right character
        while(left < right && !Character.isLetterOrDigit(s.charAt(right))) {
            right--; // keep moving (decrement) until we find a valid right char
        }
        // found valid right character now
        
        // compare
        if(left < right && s.charAt(left) != s.charAt(right)) {
            return false;
        } else {
            // otherwise they are equal so move to check next iteration
            left++;
            right--;
        }
    }
    
    return true;
}
}
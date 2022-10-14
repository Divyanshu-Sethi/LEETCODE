class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int rev=0; 
        int temp=x;
        while(temp>0)
        {
            int a=temp%10;
            rev=rev*10+a;
            temp=temp/10;
        }
        if(rev==x)
            return true;
        else 
            return false;
        
    }
}

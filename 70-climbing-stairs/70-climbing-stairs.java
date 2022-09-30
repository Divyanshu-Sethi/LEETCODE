class Solution {
    public int climbStairs(int n) {
        int sum = 0;
        int a = 1, b =2;
        if (n==a)
            return a;
        if(n==b)
            return b;
        for( int i = 3;i <=n ; i++){
            sum = a+b;
            a=b;
            b=sum;
        }
        return sum;
    }
}
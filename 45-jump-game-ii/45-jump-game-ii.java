class Solution {
    
   public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        return solve(0, nums, dp);
    }
    public int solve(int n, int[] nums, int[] dp) {
        
         int maxLen = nums.length-1;
        if(n >= maxLen) return 0;
        if(dp[n] != 0) return dp[n];
      
        int totaljump = Integer.MAX_VALUE;
        int minNoOfJumps = maxLen;
        for(int i=1; i<=nums[n]; i++) {
            int noOfjump = 1 + solve(n+i, nums, dp);
            minNoOfJumps = Math.min(minNoOfJumps, noOfjump);
        }
        return dp[n] = minNoOfJumps;
    }
}
class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=Integer.MIN_VALUE;;
        int cursum=0;

        for(int i=0;i<nums.length;++i){
            cursum+=nums[i];
            maxsum=Math.max(cursum,maxsum);
            if(cursum<0){
                cursum=0;
            }
        }
      
        return maxsum;
    }
}
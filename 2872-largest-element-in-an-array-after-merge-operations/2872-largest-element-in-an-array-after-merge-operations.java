class Solution {
    public long maxArrayValue(int[] nums) {
        long sol=nums[nums.length-1];
        for(int i = nums.length-2 ; i >= 0 ; --i){
            if(nums[i]>sol){
                sol=nums[i];
            }else{
                sol+=nums[i];
            }
        }
    return sol;
    }
}
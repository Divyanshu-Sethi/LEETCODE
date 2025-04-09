class Solution {
    public int majorityElement(int[] nums) {
    int candidate=nums[0];
    int vote=1;

    for(int i=1;i<nums.length;++i){
        if(vote == 0){
            candidate = nums[i];
            vote=1;
        }else if(nums[i]==candidate){
            vote++;
        }else{
            vote--;
        }
    }
    return candidate;
    }
}
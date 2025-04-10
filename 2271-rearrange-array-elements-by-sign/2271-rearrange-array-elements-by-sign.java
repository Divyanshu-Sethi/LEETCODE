class Solution {
    //   public int[] rearrangeArray(int[] nums) {
    //     int n = nums.length;
    //     int[] pos = new int[n / 2];
    //     int[] neg = new int[n / 2];
    //     int p = 0, ne = 0;

    //     // Separate positive and negative numbers
    //     for (int i = 0; i < n; ++i) {
    //         if (nums[i] < 0) {
    //             neg[ne++] = nums[i];
    //         } else {
    //             pos[p++] = nums[i];
    //         }
    //     }

    //     int[] result = new int[n];
    //     int idx = 0;

    //     // Alternate fill from pos and neg
    //     for (int i = 0; i < n / 2; ++i) {
    //         result[idx++] = pos[i];
    //         result[idx++] = neg[i];
    //     }

    //     return result;}

    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int pos = 0, neg = 1;
        
        for(int i=0;i<n;++i){
            if(nums[i]>0){
                ans[pos]=nums[i];
                pos+=2;
            }else{
                ans[neg]=nums[i];
                neg+=2;
            }
        }
    return ans;
    }
}
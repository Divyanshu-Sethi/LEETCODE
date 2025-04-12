class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0, right=n-1;
        int ans=0;
        while(left < right){
        int width = right-left;
        int ht = Math.min(height[left],height[right]);
        int cur=width * ht;
        ans = Math.max(cur,ans);

        if(height[left]>height[right]){
            right--;
        }else{ 
            left++;
        }
        }
    return ans;
    }
}
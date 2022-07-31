class Solution {
    public int maxArea(int[] height) { 
    
        int maxarea = 0;
        int a=0;
        int b=height.length-1;
        while(a<b){
            int width;
            width=b-a;
            int small=Math.min(height[a],height[b]);
            maxarea=Math.max(maxarea,small*width);
            if (height[a]<=height[b]){
                a++;
            }else{
                b--;
            }
        }
        return maxarea;  
    }
}
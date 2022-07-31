class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int n=nums1.length+nums2.length;
        int[] merger=new int[n];
        for(int i=0;i<nums1.length;++i){
            merger[i]=nums1[i];
        }
        for(int i=0;i<nums2.length;++i){
            merger[nums1.length+i]=nums2[i];
        }
        Arrays.sort(merger);
        
        //array merged and sorted
        
        //for median 
        double median=0;
        if(n % 2==0){
             median = ((merger[n/2] + merger[n/2-1])/2.0);
        }else{
             median =(merger[n/2]);
        }
    return median ;
    }
}
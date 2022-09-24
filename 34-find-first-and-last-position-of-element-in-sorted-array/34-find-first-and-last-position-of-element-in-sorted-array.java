class Solution {
    
    public int[] searchRange(int[] nums, int target) {
        
        int[] arr=new int[2];
        
         int firstindex=first_index(nums,target);
        int lastindex=last_index(nums,target);

         arr[0]=firstindex;
         arr[1]=lastindex;
        
        return arr;
    }
    
    public static int first_index(int[]arr , int d){
        int save=-1;
        int left=0 ;
        int right=arr.length-1;

        while(left<=right){
            int mid=(left+right)/2;

            if(arr[mid]>d){
                right=mid-1;
            }
            else if(arr[mid]<d){
                left=mid+1;
            }
            else{
                save=mid;
                right=mid-1;
            }
        }
    return save;
    }

    public static int last_index(int[]arr , int d){
        int save=-1;
        int left=0 ;
        int right=arr.length-1;

        while(left<=right){
            int mid=(left+right)/2;

            if(arr[mid]>d){
                right=mid-1;
            }
            else if(arr[mid]<d){
                left=mid+1;
            }
            else{
                save=mid;
                left=mid+1;
            }
        }
        return save;
    }

    
    
}
// class Solution {
//     public int longestConsecutive(int[] arr) {
//         Map<Integer, Boolean> map = new HashMap<>();
//         for (int val : arr) {
//             map.put(val, true);
//         }

//         for (int val : arr) {
//             if (map.containsKey(val - 1)) {
//                 map.put(val, false);
//             }
//         }

//         int max = 0;
//         for (int val : arr) {
//             if (map.get(val) == true) {
//                 int tl = 1;
//                 int tsp = val;

//                 while (map.containsKey(tsp + 1)) {
//                     tsp++;
//                     tl++;
//                 }

//                 max = Math.max(tl, max);
//             }

//         }
//         return max;
//     }
// }
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        Arrays.sort(nums);
        int c=1,max=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[i-1])
            {
            if(nums[i]-nums[i-1]==1)
            {
                c++;
            }else{
                max=Math.max(max,c);
                c=1;
            }
            }
        }
        return Math.max(max,c);
    }
}

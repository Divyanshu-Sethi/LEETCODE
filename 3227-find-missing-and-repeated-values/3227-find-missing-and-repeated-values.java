class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ans=new int[2];
        HashSet<Integer> set=new HashSet<>();
        int n=grid.length;
        int a=0;  //repeated value
        int b=0;  //missing value
        int actsum=0;
        for(int i=0;i<n;++i){
            for(int j=0;j<n;++j){
                actsum+=grid[i][j];
                if(set.contains(grid[i][j])){
                 a=grid[i][j];            
                }else{
                    set.add(grid[i][j]);
                }
            }
        }
        int m=n*n;
        int expsum= m*(m+1)/2;
        b=expsum+a-actsum;   //formulae used is Expected sum + 

        ans[0]=a;
        ans[1]=b;

        return ans;
        
    }
}
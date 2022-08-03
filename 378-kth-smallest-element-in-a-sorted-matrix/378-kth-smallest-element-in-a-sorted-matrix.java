class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix[0].length;
        int[] a=new int[n*n];
    
      //  int sr=0,sc=0,ec=0;         
        //sr=starting row ,sc=starting column ,ec= ending column
        int x=0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                a[x]= matrix[i][j];
                x++;
            }
        }
               Arrays.sort(a);
       
        return a[k-1];
         }

}
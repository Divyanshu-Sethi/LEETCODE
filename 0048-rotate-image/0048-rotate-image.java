class Solution {
    public void rotate(int[][] arr) {
     
     //Transposing the matrix
        for(int i=0;i<arr.length;++i){
            for(int j=i;j<arr[0].length;++j){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    
     //Reversing the rows 
        for(int i=0;i<arr.length;++i){
            int l=0;
            int r=arr[0].length-1;
            while(l<r){
                int temp=arr[i][l];
                arr[i][l]=arr[i][r];
                arr[i][r]=temp;
                
                l++;
                r--;
            }
        }   

    }
}
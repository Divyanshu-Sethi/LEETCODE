class Solution {
   public void merge(int[] a, int m, int[] b, int n) {
     int i=m-1, j=n-1, idx=m+n-1;
     while (i>=0 && j>=0){
        if(a[i]>=b[j]){
            a[idx]=a[i];
            idx--;
            i--;
        }else{
            a[idx]=b[j];
            idx--;
            j--;
        }
     }

     while(j>=0){
        a[idx]=b[j];
        idx--;
        j--;
     }
 
}
}
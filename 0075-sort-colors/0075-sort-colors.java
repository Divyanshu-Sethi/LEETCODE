class Solution {
    public void sortColors(int[] n) {
        int zero=0;
        int ones=0;

        for(int i=0;i<n.length;++i){
            if(n[i]==0){
            zero++;
            }
            else if(n[i]==1){
            ones++;
            }
        }

            for (int i=0;i<zero;++i){
                n[i]=0;
            }
            for(int i=zero; i<zero+ones; i++){
                n[i]=1;
            }
            for(int i=zero+ones; i<n.length; ++i){
                n[i]=2;
            }

            System.out.println(n);
        
    }
}
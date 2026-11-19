class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n = nums.length;
        int size  =0;
         for(int j=0;j<n;j+=2){
            size +=nums[j];
         }
          int ans[] = new int [size];
       
       
       int index = 0;
        for(int i=0;i<n;i=i+2){
            int fr = nums[i];
            int val = nums[i+1];
            while(fr!=0){
                ans[index]=val;
                index++;
                fr--;
            }
        }
       
        
        return ans;


    }
}
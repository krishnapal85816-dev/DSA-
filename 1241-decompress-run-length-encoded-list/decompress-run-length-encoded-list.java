class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n = nums.length;
        ArrayList<Integer>list = new ArrayList<>();
       
        for(int i=0;i<n;i=i+2){
            int fr = nums[i];
            int val = nums[i+1];
            while(fr!=0){
                list.add(val);
                fr--;
            }
        }
         int ans[] = new int [list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;


    }
}
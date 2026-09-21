class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int i=0;i<=31;i++){
            int sum =0;
            for(int n :nums){
                sum+=(n>>i)&1;
            }
            if(sum%3 !=0){
                ans = ans|(1<<i);
            }
        }
        return ans;
        
    }
}
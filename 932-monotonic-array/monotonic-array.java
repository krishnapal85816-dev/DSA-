class Solution {

    public boolean isMonotonic(int[] nums) {
        boolean inc,dec;
        inc = dec = true;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1]){
                dec = false;
            }
            if(nums[i]<nums[i+1]){
                inc = false;
            }
        }
        return inc||dec;
    }
}
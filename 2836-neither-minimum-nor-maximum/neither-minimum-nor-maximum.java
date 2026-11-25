class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length==2 ||nums.length==1){
            return -1;
        }
        Arrays.sort(nums);
        if(nums[0]!=nums[1]){
            return nums[1];
        }
        else{
            return nums[2];
        }
        
        
    }
}
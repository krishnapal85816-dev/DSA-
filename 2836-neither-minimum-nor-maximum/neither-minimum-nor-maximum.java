class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length<=2){
            return -1;
        }
        int a = nums[0];
        int b = nums[1];
        int c = nums[2];
        if(a<b &&b<c || a>b&&b>c){
            return b;
        }
        if(b<a &&a<c || b>a&&a>c){
            return a;
        }
        else 
         return c;
        
        
    }
}
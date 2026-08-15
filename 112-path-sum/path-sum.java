class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false ;
        }
        if(root.left == null && root.right == null && root.val == targetSum){
            return true ;
        }
        boolean ans1 = hasPathSum(root.left , targetSum-root.val);
        boolean ans2 = hasPathSum(root.right, targetSum-root.val);
        return ans1 || ans2 ;
    }
}
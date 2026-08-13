class Solution {
     boolean balanceFactor = true ;
    public int height(TreeNode root){
      if(root==null){
        return 0 ;
      }
      int lh = height(root.left);
      int rh = height(root.right);

      if(Math.abs(lh-rh)>1){
        balanceFactor = false ;
      }

      return Math.max(lh , rh ) +1 ;
    }
    public boolean isBalanced(TreeNode root) {
        int h = height(root);

        return balanceFactor ;
    }
}
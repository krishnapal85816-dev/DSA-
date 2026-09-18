class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) { this.val = val; }
}

class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        // If left subtree is null, recurse on right subtree
        if (root.left == null) {
            return minDepth(root.right) + 1;
        }
        
        // If right subtree is null, recurse on left subtree
        if (root.right == null) {
            return minDepth(root.left) + 1;
        }
        
        // If both subtrees exist, take the minimum of both
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}
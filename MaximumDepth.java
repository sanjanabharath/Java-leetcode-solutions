//https://leetcode.com/problems/maximum-depth-of-binary-tree/description/

class Solution {
    public int maxDepth(TreeNode root) {
        if(root == ){
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left, right) + 1;
    }
}

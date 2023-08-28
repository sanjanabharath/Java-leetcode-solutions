//https://leetcode.com/problems/binary-tree-preorder-traversal/description/

class Solution {
    List<Integer> ans = new LinkedList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null){
            return new LinkedList<>();
        }

        ans.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        

        return ans;
    }
}

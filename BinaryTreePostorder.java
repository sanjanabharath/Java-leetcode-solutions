//https://leetcode.com/problems/binary-tree-postorder-traversal/description/
class Solution {
    List<Integer> ans = new LinkedList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null){
            return new LinkedList<>();
        }

        
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        ans.add(root.val);

        return ans;
    }
}

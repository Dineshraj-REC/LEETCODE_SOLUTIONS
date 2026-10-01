/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return isMirrored(root.left,root.right);
    }
    public boolean isMirrored(TreeNode L,TreeNode R){
        if(L==null && R==null){
            return true;
        }
        if(L==null || R==null){
            return false;
        }
        if(L.val!=R.val){
            return false;
        }
        return isMirrored(L.left,R.right)&&isMirrored(L.right, R.left);
    }
}
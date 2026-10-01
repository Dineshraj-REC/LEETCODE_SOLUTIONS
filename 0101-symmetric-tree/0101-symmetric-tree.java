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
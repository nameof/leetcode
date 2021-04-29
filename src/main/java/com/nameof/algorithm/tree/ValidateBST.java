package com.nameof.algorithm.tree;


public class ValidateBST {
    long pre = Long.MIN_VALUE;

    public boolean isValidBST(TreeNode root) {
        return dfs(root);
    }

    private boolean dfs(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean l = dfs(root.left);
        if (root.val <= pre) {
            return false;
        }
        pre = root.val;
        boolean r = dfs(root.right);
        return l && r;
    }
}

package leetcode;

import java.util.Stack;

public class leetcode101 {
    public boolean isSymmetric(TreeNode root) {
        if (root==null){
            return true;
        }
        return isMirror(root.left,root.right);
    }
    public boolean isMirror(TreeNode left,TreeNode right) {
        if (left==null&&right==null){
            return true;
        }
        if (left==null||right==null){
            return false;
        }
        return left.val==right.val&&isMirror(right.left,left.right)
                &&isMirror(left.left,right.right);
    }
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}

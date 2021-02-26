package leetcode;

import java.util.LinkedList;
import java.util.Stack;

public class leetcode226 {
    public TreeNode invertTree(TreeNode root) {
        if (root==null){
            return null;
        }
        TreeNode t=new TreeNode();
        t=root.left;
        root.left=root.right;
        root.right=t;
        invertTree(root.left);
        invertTree(root.right);
        return root;
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

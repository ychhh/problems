package leetcode;

public class leetcode543 {
    int max;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        depth(root);
        return max;
    }
    public int depth(TreeNode root) {
        if (root.left == null && root.right == null) {
            return 0;
        }
        int leftSize = root.left == null? 0: depth(root.left) + 1;
        int rightSize = root.right == null? 0: depth(root.right) + 1;
        max = Math.max(max, leftSize + rightSize);
        return Math.max(leftSize, rightSize);
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

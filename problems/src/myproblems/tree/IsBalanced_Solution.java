package myproblems.tree;

public class IsBalanced_Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        return depth(root)!=-1;
    }
    public int depth(TreeNode root){
        if(root == null)return 0;
        int left = depth(root.left);
        if(left == -1)return -1; //如果发现子树不平衡之后就没有必要进行下面的高度的求解了
        int right = depth(root.right);
        if(right == -1)return -1;//如果发现子树不平衡之后就没有必要进行下面的高度的求解了
        if(left - right <(-1) || left - right > 1)
            return -1;
        else
            return 1+(left > right?left:right);
    }

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }

    }
}

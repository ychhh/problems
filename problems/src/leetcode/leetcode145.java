package leetcode;

import dp.principle.isp.IFlyAnimal;

import java.util.ArrayList;
import java.util.List;

public class leetcode145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        postorder(root,res);
        return res;
    }
    public void postorder(TreeNode root,List<Integer> res){
        if (root==null){
            return;
        }
        postorder(root.left,res);
        postorder(root.right,res);
        res.add(root.val);
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

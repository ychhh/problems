package leetcode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class leetcode102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        LinkedList<TreeNode> queue=new LinkedList<>();
        List<List<Integer>> res=new ArrayList<>();
        if (root==null){
            return res;
        }
        queue.add(root);
        while (!queue.isEmpty()){
            int size=queue.size();
            List<Integer> list=new ArrayList<>();
            for (int i=0;i<size;i++){
                TreeNode node=queue.getFirst();
                list.add(node.val);
                if (node.left!=null){
                    queue.add(node.left);
                }
                if (node.right!=null){
                    queue.add(node.right);
                }
                queue.removeFirst();
            }
            res.add(list);
        }
        return res;
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

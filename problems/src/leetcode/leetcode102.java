package leetcode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class leetcode102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        LinkedList<TreeNode> queue=new LinkedList();
        List<List<Integer>> lists=new ArrayList<>();
        if(root==null){
            return lists;
        }
        queue.offer(root);
        while (!queue.isEmpty()){
            ArrayList<Integer> arrayList=new ArrayList<>();
            int size=queue.size();
            for (int i=0;i<size;i++){
                root=queue.getFirst();
                arrayList.add(root.val);
                if (root.left!=null){
                    queue.offer(root.left);
                }
                if (root.right!=null){
                    queue.offer(root.right);
                }
                queue.remove();
            }
            lists.add(arrayList);
        }
        return lists;
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

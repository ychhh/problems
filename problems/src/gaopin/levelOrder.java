package gaopin;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class levelOrder {
    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        // write code here
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        Queue<TreeNode> queue=new ArrayDeque();
        if (root==null){
            return res;
        }
        int size=0;
        queue.offer(root);
        while (!queue.isEmpty()){
            size =queue.size();
            ArrayList<Integer> list=new ArrayList<>();
            for (int i=0;i<size;i++){
                list.add(queue.peek().val);
                if (queue.peek().left!=null){
                    queue.offer(queue.peek().left);
                }
                if (queue.peek().right!=null){
                    queue.offer(queue.peek().right);
                }
                queue.remove();
            }
            res.add(list);
        }
        return res;
    }
     public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
  }
}

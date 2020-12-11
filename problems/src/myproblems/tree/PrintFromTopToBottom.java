package myproblems.tree;

import java.util.ArrayList;
import java.util.LinkedList;

public class PrintFromTopToBottom {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list=new ArrayList();
        LinkedList<TreeNode> queue =new LinkedList();
        if (root==null)
            return list;
        queue.offer(root);
        while(!queue.isEmpty()){
            list.add(queue.getFirst().val);
            if (queue.getFirst().left!=null){
                queue.offer(queue.getFirst().left);
            }
            if (queue.getFirst().right!=null){
                queue.offer(queue.getFirst().right);
            }
            queue.remove();
        }
        return list;
    }
    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        // write code here

        LinkedList<TreeNode> queue=new LinkedList<TreeNode>();
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        if (root==null){
            return list;
        }
        queue.offer(root);
        while (!queue.isEmpty()){
            int size=queue.size();
            ArrayList<Integer> list1=new ArrayList<>();
            for (int i=0;i<size;i++){
                list1.add(queue.getFirst().val);
                if (queue.getFirst().left!=null){
                    queue.offer(queue.getFirst().left);
                }
                if (queue.getFirst().right!=null){
                    queue.offer(queue.getFirst().right);
                }
                queue.remove();
            }
            list.add(list1);
        }
        return list;
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

package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class leetcode104 {
//    public int maxDepth(TreeNode root) {
//          if (root==null){
//              return 0;
//          }
//          return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
//    }
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        ArrayList list = new ArrayList();
        int depth=0;
        queue.offer(root);
        while (!queue.isEmpty()){
            int size=queue.size();
            for (int i=0;i<size;i++){
                root=queue.getFirst();
                if (root.left!=null)
                    queue.offer(root.left);
                if (root.right!=null)
                    queue.offer(root.right);
                queue.remove();
            }
            depth++; }
        return depth;
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

package leetcode;

import java.util.*;

public class leetcode104 {
//    public int maxDepth(TreeNode root) {
//          if (root==null){
//              return 0;
//          }
//          return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
//    }
    public int maxDepth(TreeNode root) {
        if (root==null){
            return 0;
        }
        int depth=0;
        Deque<TreeNode> deque=new ArrayDeque<>();
        deque.offer(root);
        while (!deque.isEmpty()){
            int size=deque.size();
            for (int i=0;i<size;i++) {
                if (deque.peek().left != null) {
                    deque.add(deque.peek().left);
                }
                if (deque.peek().right != null) {
                    deque.add(deque.peek().right);
                }
                deque.remove();
            }
            depth++;

        }
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

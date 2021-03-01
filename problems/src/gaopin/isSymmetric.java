package gaopin;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class isSymmetric {
//    public boolean isSymmetric (TreeNode root) {
//        // write code here
////        if (root==null){
////            return true;
////        }
////        return isMirror(root.left,root.right);
//
//    }
//    public boolean isMirror (TreeNode left,TreeNode right) {
//        // write code here
//        if (left==null&&right==null){
//            return true;
//        }
//        if (left==null||right==null){
//            return false;
//        }
//        return left.val==right.val&&isMirror(left.left,right.right)&&isMirror(right.left,left.right);
//
//    }
public boolean isSymmetric (TreeNode root) {
//     write code here
        if (root==null){
            return true;
        }
        return check(root,root);

}
    public boolean check(TreeNode left,TreeNode right){
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(left);
        queue.offer(right);
        while (!queue.isEmpty()) {
            left=queue.poll();
            right=queue.poll();
            if (left == null && right == null) {
                continue;
            }
            if ((left==null||right==null)||left.val!=right.val){
                return false;
            }
            queue.offer(left.left);
            queue.offer(right.right);
            queue.offer(left.right);
            queue.offer(right.left);
        }
        return true;

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

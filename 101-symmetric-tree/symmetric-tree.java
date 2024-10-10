/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isSameTree(root.left, root.right);
    }

    public TreeNode invertTree(TreeNode p) {
        if (p == null) {
            return p;
        }
        TreeNode temp = p.left;
        p.left = p.right;
        p.right = temp;
        return p;
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        TreeNode invertedQ = invertTree(q);
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, invertedQ.left) && isSameTree(p.right, invertedQ.right);
    }
}
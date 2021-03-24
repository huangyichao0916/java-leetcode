package p226;

import javax.swing.tree.TreeNode;

public class P226 {
}

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode tn = root.left;
        root.left = root.right;
        root.right = tn;
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
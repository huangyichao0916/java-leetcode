package p144;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class P144 {
    public static void main(String[] args) {

    }
}

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList arrl1 = new ArrayList();
        helper(root,arrl1);
        return arrl1;
    }

    public void helper(TreeNode node, ArrayList arr) {
        if (node == null) {
            return;
        }
        arr.add(node.val);
        helper(node.left,arr);
        helper(node.right,arr);
    }
}
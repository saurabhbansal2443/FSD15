public class BinaryTreePaths {

}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();

        if (root == null) {
            return list;
        } else if (root.left == null && root.right == null) {
            list.add(root.val + "");
            return list;
        }

        List<String> llist = binaryTreePaths(root.left);
        List<String> rlist = binaryTreePaths(root.right);

        for (String s : llist) {
            list.add(root.val + "->" + s);
        }

        for (String s : rlist) {
            list.add(root.val + "->" + s);
        }

        return list;

    }
}

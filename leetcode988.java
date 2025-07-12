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
    private String result;

    public String smallestFromLeaf(TreeNode root) {
        result = "~";  
        function(root, new StringBuilder());
        return result;
    }

    private void function(TreeNode root, StringBuilder sb) {
        if (root == null) return;

        sb.insert(0, (char) ('a' + root.val));

        if (root.left == null && root.right == null) {
            String current = sb.toString();
            if (current.compareTo(result) < 0) {
                result = current;
            }
        }

        function(root.left, sb);
        function(root.right, sb);

        sb.deleteCharAt(0);
    }
}

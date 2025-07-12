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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result=new ArrayList<>();
        function(root,targetSum,0,result,new ArrayList<>());
        return result;
    }
    private void function(TreeNode root,int target,int sum,List<List<Integer>> result,List<Integer> list){
        if(root==null){
            return;
        }
        sum+=root.val;
        list.add(root.val);

        if(root.right==null && root.left==null && sum==target){
           result.add(new ArrayList<>(list));
        }
        
        if(root.left!=null) function(root.left,target,sum,result,list);
        if(root.right!=null) function(root.right,target,sum,result,list);
        list.remove(list.size()-1);
    }
}

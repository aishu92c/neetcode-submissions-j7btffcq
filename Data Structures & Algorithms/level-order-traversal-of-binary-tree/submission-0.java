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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) return result;

        queue.offer(root);
        while(!queue.isEmpty())  {
        List<Integer> levelValues = new ArrayList<>();
        int size = queue.size();
        for(int i =0; i< size; i++) {
            TreeNode temp = queue.poll();
            if(temp != null) {
            levelValues.add(temp.val);
            queue.offer(temp.left);
            queue.offer(temp.right);
            }
        }    
        if(!levelValues.isEmpty()) { 
        result.add(levelValues);
        }
        }
        return result;
    }
}

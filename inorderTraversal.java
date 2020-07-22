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
    public List<Integer> inorderTraversal(TreeNode root) {
        //Iterative Solution
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        
        TreeNode curr = root;
        
        while (curr != null || !(stack.isEmpty())) {
            while (curr != null) {
                stack.add(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            list.add(curr.val);
            curr = curr.right;
        }
        // recursive solution
        //findInorder(root, list);
        
        
        return list;
    }
    
    // Recursive solution
    // public void findInorder(TreeNode node, List<Integer> list) {
    //     if (node == null) {
    //         return;
    //     }
    //     findInorder(node.left, list);
    //     list.add(node.val);
    //     findInorder(node.right, list);
    // }
    
}
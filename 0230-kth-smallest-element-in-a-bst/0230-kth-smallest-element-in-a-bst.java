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
class Solution 
{
    private int c=0; 
    private int r=-1;
    public int kthSmallest(TreeNode root, int k) 
    {
        inorder(root,k);
        return r;
    }
    private void inorder(TreeNode node,int k)
    {
        if(node==null)
        return;
        inorder(node.left,k);
        c++;
        if(c==k)
        {
            r=node.val;
            return;
        }

        inorder(node.right,k);
    }
}
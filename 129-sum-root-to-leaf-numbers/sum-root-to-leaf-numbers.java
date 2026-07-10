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
    int s=0;
    private void b(TreeNode r,int n)
    {
        if(r==null)return;
        n=(n*10)+r.val;
        if(r.left==null&&r.right==null)
        {
            s+=n;
            return;
        }
        
        b(r.left,n);
        b(r.right,n);
        return;
    }
    public int sumNumbers(TreeNode root) {
        b(root,0);
        return s;
    }
}
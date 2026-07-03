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
    static TreeNode ins(int n[],int l,int r)
    {
        if(l>r)return null;

        int m=(l+r)/2;
        
            TreeNode rr=new TreeNode(n[m]);
            rr.left=ins(n,l,m-1);
            rr.right=ins(n,m+1,r);

            return rr;
       
        
        
    }
    public TreeNode sortedArrayToBST(int[] n) {
        
        


        
        return ins(n,0,n.length-1) ;

    }
}
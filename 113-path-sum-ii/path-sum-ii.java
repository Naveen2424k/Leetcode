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
    private void has(TreeNode r,int t,List<Integer> a,List<List<Integer>> op,int c)
    {

        if(r==null)return;
        c+=r.val;
        a.add(r.val);
        if(r.left==null &&r.right==null &&c==t)
        {
            op.add(new ArrayList<>(a));
        }
        has(r.left,t,a,op,c);
        has(r.right,t,a,op,c);
        a.remove(a.size()-1);



    }
    public List<List<Integer>> pathSum(TreeNode root, int t) {
        List<List<Integer>> m=new ArrayList<>();
        has(root,t,new ArrayList<>(),m,0);
        return m;
    }
}
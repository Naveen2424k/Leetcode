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
        List<List<Integer>> op=new ArrayList<>();
        Queue<TreeNode> m=new LinkedList<>();
        
        if(root==null)return op;
        m.add(root);
        while(!m.isEmpty())
        {
            int n=m.size();
            List<Integer>a=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                TreeNode t=m.poll();
                a.add(t.val);
                if(t.left!=null)m.add(t.left);
                if(t.right!=null)m.add(t.right);

            }
            op.add(new ArrayList<>(a));
        }
        return op;
    }
}
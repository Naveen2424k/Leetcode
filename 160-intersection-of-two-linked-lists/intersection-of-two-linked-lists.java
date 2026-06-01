/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode a, ListNode b) {
        ListNode s=a;
        ListNode f=b;
        while(s!=f)
        {
            s=s==null?b:s.next;
            f=f==null?a:f.next;
        }
        return  s;
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode h) {
        ListNode p=null;
        
        ListNode c=h;
        if (h==null)return h;
        while(c!=null )
        {
            ListNode n=c.next;
            c.next=p;

            
            p=c;
            System.out.println(p.val);
            c=n;
        }
        return p;

    }
}
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode hh) {
        // if(hh==null) return hh;
        ListNode f=hh;
        ListNode h=hh;
        while(f!=null && f.next!=null)
        {
            h=h.next;
            f=f.next.next;
            if(f==h)
                break;
            
        }
        if(f==null||f.next==null) return null;
        while(hh!=h)
        {
            hh=hh.next;
            h=h.next;
        }
        return hh;
    }
}
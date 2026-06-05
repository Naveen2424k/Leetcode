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
    public int getDecimalValue(ListNode h) {
        String a="";
        while(h!=null)
        {
            a+=h.val;
            h=h.next;
        }
        System.out.println(a);
        return Integer.parseInt(a,2);
    }
}
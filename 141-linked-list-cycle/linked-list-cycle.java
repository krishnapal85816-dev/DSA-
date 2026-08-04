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
    public boolean hasCycle(ListNode head) {
        
        ListNode slo = head;
        ListNode fst = head;
        while(fst!=null && fst.next!=null){
            slo=slo.next;
            fst=fst.next.next;
            if(slo==fst){
                return true;
            }
        }
        return false;
    }
}
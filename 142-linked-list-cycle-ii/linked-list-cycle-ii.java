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
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        if(head.next.next==head ){
            return head;
        }
          ListNode slo = head;
        ListNode fst = head;
         ListNode str = head;
        while(fst!=null && fst.next!=null){
            slo=slo.next;
            fst=fst.next.next;
            if(slo==fst){
                if(fst==str){
                    return str;
                }
                while(slo!=null){
                    slo=slo.next;
                    str=str.next;
                    if(str==slo){
                        return str;
                    }
                }
            }

        }
        return null;
    }
        
    
}
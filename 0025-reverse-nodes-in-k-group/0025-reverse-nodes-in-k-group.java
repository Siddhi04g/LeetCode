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
    public ListNode reverse(ListNode head , ListNode end){
        end.next = null;
        // ListNode n = head.next;
        // List prev = null;
        // ListNode curr = head;
        // while(curr != null){
        //     curr.next = prev;
        //     curr = n;
        //     prev = curr;
        // }
       ListNode prev=null;
       ListNode curr=head;
       ListNode temp;
       while(curr!=null){
           temp=curr.next;
           curr.next=prev;
           prev=curr;
           curr=temp;
       }
        return  prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode list = head;
        int t = k-1;
        while(t-->0){
            list = list.next;
        }
        ListNode node = head;
        int c = 0;
        while(node != null){
            c++;
            node = node.next;
        }
        int count = (int)c/k;
        //ListNode start = head;
        ListNode prev = null;
        ListNode curr = head;
        
        while(count-->0){
            ListNode ends = curr;
            t = k-1;
            while(t-->0){
                ends = ends.next;
            }
            ListNode ende = ends.next;
            ListNode rev = reverse(curr,ends);
            if(prev != null)
            prev.next = rev;
            prev = curr;
            curr = ende;  
        }
        ListNode st = list;
        while(st.next!= null)
        st = st.next;
        st.next = curr;
        return list;
    }
}
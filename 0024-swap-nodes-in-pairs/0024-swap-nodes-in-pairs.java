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
    public ListNode swapPairs(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        ListNode prev=null;
        ListNode curr=head;
        ListNode node=head.next;
        ListNode ans=head.next;
        while(curr.next!=null && curr.next.next!=null){
            curr.next=node.next;
            node.next=curr;
            if(prev!=null)
            prev.next=node;
            prev=curr;
            curr=curr.next;
            node=curr.next;
            // System.out.print(prev.val+" ");
            // System.out.print(curr.val+" ");
           // System.out.println(node.val+" ");
        }
        if(node!=null){
            if(prev!=null)
            prev.next=node;
            node.next=curr;
            curr.next=null;
        }
        return ans;
    }
}
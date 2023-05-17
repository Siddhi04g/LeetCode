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
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode node=head;
        ListNode prev=null;
        while(fast!=null){
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
            // if(fast.next.next==null){
            //     node=slow;
        }
        prev.next=null;
        System.out.println(prev.val);
        prev=null;
        ListNode temp=slow;
        while(temp!=null){
            temp=temp.next;
            slow.next=prev;
            prev=slow;
            slow=temp;
        }
        int sum=0,maxS=0;
        while(node!=null && prev!=null){
            sum=node.val+prev.val;
            maxS=Math.max(sum,maxS);
            node=node.next;
            prev=prev.next;
        }
        return maxS;
    }
}
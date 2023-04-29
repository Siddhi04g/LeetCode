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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(-1);   //dummy node
        ListNode ans=head;
        ListNode p=l1;
        ListNode q=l2;
        int sum=0;
        while(p!=null && q!=null){
            sum=p.val+q.val+sum/10;
            ListNode node=new ListNode(sum%10);
            ans.next=node; 
            ans=ans.next;
            p=p.next;
            q=q.next;
        }
        while(p!=null){
            sum=p.val+sum/10;
            ListNode node=new ListNode(sum%10);
            ans.next=node;
            ans=ans.next;
            p=p.next;
        }
        while(q!=null){
            sum=q.val+sum/10;
            ListNode node=new ListNode(sum%10);
            ans.next=node;
            ans=ans.next;
            q=q.next;
        }
        if(sum/10 !=0 ){
            ans.next=new ListNode(sum/10);
        }
        return head.next;
    }
}
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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode node=head;
        ListNode size=head;
        int count=0;
        while(size!=null){
            count++;
            size=size.next;
        }
        int c=1;
        while(node!=null){
            if(c==k){
                break;
            }
            c++;
            node=node.next;
        }
        ListNode node1=head;
        c=0;
        while(node1!=null){
            if(c==count-k){
                break;
            }
            c++;
            node1=node1.next;
        }
        
        int temp=node.val;
        node.val=node1.val;
        node1.val=temp;

        return head;
    }
}
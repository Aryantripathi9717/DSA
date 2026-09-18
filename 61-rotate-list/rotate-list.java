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
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0 || head == null || head.next==null) return head;
        ListNode temp = head;
        ListNode t = head;
        int size = 0;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        k = k % size;
        if(k==0) return head;
        int i = 0;
        while(i<size-k-1){
            head = head.next;
            i++;
        }
        temp = head.next;
        head.next = null;
        head = temp;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = t;
        return head;
    }
}
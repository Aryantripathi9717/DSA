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
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp = head;
        int size = 0;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        int[] ans = new int[size];
        temp = head;
        int i = 0;
        while(temp.next!=null){
            ListNode curr = temp.next;
            ListNode next = temp.next;
            int flag = 0;
            while(curr!=null){
                if(temp.val < curr.val){
                    ans[i] = curr.val;
                    flag = 1;
                    break;
                }
                curr = curr.next;
            }
            if(flag == 0) ans[i] = 0;
            i++;
            temp = next;
        }
        ans[size-1] = 0;
        return ans;
    }
}
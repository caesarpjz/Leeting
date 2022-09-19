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
    public ListNode middleNode(ListNode head) {
        ListNode curr = head;
        int counter = 0;
        while (head != null) {
            counter++;
            if (counter % 2 == 0) {
                // ((x + 1) / 2) + 0.5
                curr = curr.next;
            }
            
            if (head.next == null) {
                break;
            }
            
            head = head.next;
        }
        

        return curr;
    }
}
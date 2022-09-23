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
//         int[] visited = new int[36];
//         int i = 0;
//         while (head != null) {
//             visited[i] = 1;
            
//         }
        
//         return true;
        
        // ListNode curr = head;
        // if (head == null || head.next == null) {
        //     return false;
        // }
        // while (curr.next != null && curr.next.next != null && head.next != null) {
        //     if (curr.next.next == null) {
        //         return false;
        //     }
        //     curr = curr.next.next;
        //     if (head == curr) {
        //         return true;
        //     }
        //     if (head.next == null) {
        //         return false;
        //     }
        //     head = head.next;
        // }
        // return false;
        if(head==null) return false;
        ListNode walker = head;
        ListNode runner = head;
        while(runner.next!=null && runner.next.next!=null) {
            walker = walker.next;
            runner = runner.next.next;
            if(walker==runner) return true;
        }
        return false;
    }
}

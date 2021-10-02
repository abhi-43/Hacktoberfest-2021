/*Link Of Question : https://leetcode.com/problems/linked-list-cycle/

141. Linked List Cycle

Given head, the head of a linked list, determine if the linked list has a cycle in it.
There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. 
Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.
*/

//Solution :
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
    public boolean hasCycle(ListNode head) 
    {
         if(head==null)
            return false;
        
        // Using a slow pointer which moves 1 step at a time and a fast pointer which moves 2 steps at a time.
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;            
            if(slow==fast)              //If there is a cycle in the linked list then the slow pointer and the fast pointer meets at a point else they never meet.
                return true;           
        }        
        return false;        
    }
}


/*
Sample Input 1: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.

Sample Input 2: head = [1], pos = -1
Output: false
Explanation: There is no cycle in the linked list.

Time Complexity : O(N)
Space Complexity : O(1)
*/

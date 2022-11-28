import java.util.LinkedList;

/*
 * @Author: Changwei Cao
 * @Date: 2022-11-28 20:54:30
 * @LastEditors: Changwei Cao
 * @LastEditTime: 2022-11-28 21:07:15
 * @Description: 
 */
class Solution {
    public int[] reversePrint(ListNode head) {
        LinkedList<Integer> stack = new LinkedList<Integer>();

        while (head != null) {
            stack.addLast(head.val);
            head = head.next;
        }

        int[] result = new int[stack.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = stack.removeLast();
        }

        return result;
    }
}

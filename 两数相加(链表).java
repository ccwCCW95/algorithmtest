/*
 * @Author: Changwei Cao
 * @Date: 2022-11-18 12:15:15
 * @LastEditors: Changwei Cao
 * @LastEditTime: 2022-11-18 12:27:43
 * @Description: 两数(链表形式)相加 
 */
class test {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);

        // 进位符
        int carry = 0;

        ListNode cur = dummy;

        while (l1 != null || l2 != null || carry != 0) {
            // 1. 计算
            int s = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;

            // 2. 算出进位和当前位数值
            carry = s / 10;
            cur.next = new ListNode(s % 10);

            // 3. 链表向后移动
            cur = cur.next;
            // 判空
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }

        return dummy;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

import java.util.LinkedList;

/*
 * @Author: Changwei Cao
 * @Date: 2022-12-08 09:26:43
 * @LastEditors: Changwei Cao
 * @LastEditTime: 2022-12-08 09:36:11
 * @Description: 栈实现队列功能
 */

class CQueue {
    // a实现如队列，b实现倒序
    LinkedList<Integer> a, b;

    public CQueue() {
        a = new LinkedList<Integer>();
        b = new LinkedList<Integer>();
    }

    public void appendTail(int value) {
        a.addLast(value);
    }

    public int deleteHead() {
        // 若b不为空 则弹出b尾元素
        if (!b.isEmpty())
            return b.removeLast();
        // 若a为空 则返回-1
        if (a.isEmpty())
            return -1;
        // 若a不为空 b为空 则将a中元素加入b中 再弹出b首
        while (!a.isEmpty()) {
            b.addLast(a.removeLast());
        }

        return b.removeLast();
    }
}

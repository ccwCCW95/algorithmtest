import java.util.HashSet;
import java.util.Set;

/*
 * @Author: Changwei Cao
 * @Date: 2022-11-23 10:28:11
 * @LastEditors: Changwei Cao
 * @LastEditTime: 2022-11-23 10:35:26
 * @Description: 滑动窗口
 */
class test {
    public int lengthOfLongestSubString(String s) {
        int i = 0;
        int ans = 0;
        Set<Character> ss = new HashSet<Character>();

        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);

            // 向右移动窗口左坐标 直到窗口中没有重复字符
            while (ss.contains(c)) {
                ss.remove(s.charAt(i++));
            }

            ss.add(c);

            ans = Math.max(ans, j - i + 1);
        }

        return ans;
    }
}

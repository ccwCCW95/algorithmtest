/*
 * @Author: Changwei Cao
 * @Date: 2022-11-27 22:32:10
 * @LastEditors: Changwei Cao
 * @LastEditTime: 2022-11-27 22:39:26
 * @Description: 时间复杂度 O(n^2)，空间复杂度 O(n^2)

 */
class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        // 记录回文字符串的位置 以便后面使用
        int mx = 1;
        int start = 0;
        boolean[][] dp = new boolean[n][n];

        for (int j = 0; j < n; j++) {
            for (int i = 0; i <= j; i++) {
                if (j - i < 2) {
                    // 长度不够 可以直接比较首尾字符
                    dp[i][j] = s.charAt(i) == s.charAt(j);
                } else {
                    // 例如对于字符串 “ababa”，如果我们已经知道 “bab”是回文串，那么 “ababa” 一定是回文串，这是因为它的首尾两个字母都是 “a”
                    dp[i][j] = dp[i + 1][j - 1] && s.charAt(i) == s.charAt(j);
                }

                if (mx < j - i + 1 && dp[i][j]) {
                    mx = j - i + 1;
                    start = i;
                }
            }
        }

        return s.substring(start, start + mx);
    }
}
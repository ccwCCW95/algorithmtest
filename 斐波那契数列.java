/*
 * @Author: Changwei Cao
 * @Date: 2022-12-09 10:27:30
 * @LastEditors: Changwei Cao
 * @LastEditTime: 2022-12-09 10:53:13
 * @Description: 斐波那契数列 经典动态规划
 */
class Solution {
    public int fib(int n) {
        // if (n == 0)
        // return 0;
        // int dp[] = new int[n + 1];

        // dp[0] = 0;
        // dp[1] = 1;

        // for (int i = 2; i <= n; i++) {
        // dp[i] = dp[i - 1] + dp[i - 2];
        // dp[i] %= 1000000007;
        // }

        // return dp[n];

        // 优化空间复杂度
        int sum = 0, a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }

        // 只取n位的那个数字 已经在前一步被算出
        return a;
    }
}

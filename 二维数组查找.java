/*
 * @Author: Changwei Cao
 * @Date: 2022-11-28 16:43:33
 * @LastEditors: Changwei Cao
 * @LastEditTime: 2022-11-28 16:54:34
 * @Description: 
 */
class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int i = matrix.length - 1;
        int j = 0;

        // 未越界状态下 持续向上移行或者向右移列
        while (i >= 0 && j <= matrix[0].length - 1) {
            if (target > matrix[i][j])
                j++;
            else if (target < matrix[i][j])
                i--;
            else
                return true;
        }

        return false;
    }
}

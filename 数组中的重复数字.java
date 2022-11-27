import java.util.HashSet;

/*
 * @Author: Changwei Cao
 * @Date: 2022-11-28 09:06:51
 * @LastEditors: Changwei Cao
 * @LastEditTime: 2022-11-28 09:38:52
 * @Description: 
 */
class Solution {
    public int findRepeatNumber(int[] nums) {

        // 1. Hash表方法
        // HashSet<Integer> set = new HashSet<Integer>();

        // for (int i = 0; i <= nums.length; i++) {
        // if (set.contains(nums[i])) {
        // return nums[i];
        // }

        // set.add(nums[i]);
        // }

        // return -1;

        // 2. 值换到值对应的索引处
        int i = 0;

        while (i < nums.length) {
            // 若索引位数字跟索引值相同 则不需要做处理
            if (nums[i] == i) {
                i++;
            }

            // 判断当前索引位数字是否与有放好的索引位数字 即相同
            if (nums[nums[i]] == nums[i])
                return nums[i];

            // 调整位置
            int temp = nums[i];
            nums[i] = nums[temp];
            nums[temp] = temp;
        }

        return -1;

    }
}

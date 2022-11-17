import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * @Author: Changwei Cao
 * 
 * @Date: 2022-11-17 13:27:34
 * 
 * @LastEditors: Changwei Cao
 * 
 * @LastEditTime: 2022-11-17 13:55:43
 * 
 * @Description: 运用哈希表算出两数之和 时间复杂度 O(n)，空间复杂度 O(n)
 */
class test {
    public static void main(String[] args) {
        // int[] nums = { 2, 7, 11, 15 };
        // int target = 9;

        // int[] nums = { 3, 2, 4 };
        // int target = 6;

        int[] nums = { 3, 3, 7 };
        int target = 6;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> temp = new HashMap<Integer, Integer>();

        for (int i = 0; i <= nums.length; i++) {
            int v = target - nums[i];

            if (temp.containsKey(v)) {
                return new int[] { temp.get(v), i };
            }

            temp.put(nums[i], i);
        }

        return null;
    }
}
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.abs;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mapValueIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (mapValueIndex.containsKey(target - nums[i])) {
                return new int[]{mapValueIndex.get(target - nums[i]), i};
            }
            mapValueIndex.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {-1, -2, -3, -4, -5};
        int target = -8;
        System.out.println(twoSum(nums, target)[0]);
    }
}

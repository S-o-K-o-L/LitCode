import java.util.Arrays;
import java.util.Collections;

public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int resSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            currentSum = Integer.max(currentSum, nums[i]);
            resSum = Integer.max(currentSum, resSum);
        }
        return resSum;
    }


    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums1 = {1};
        int[] nums2 = {5, 4, -1, 7, 8};
        int[] nums3 = {-5, -4, -1, -7, -8};
        int[] nums4 = {-5, 1};
        int[] nums5 = {1, -1, -2};
        int[] nums6 = {0, -3, 1, 1};
        System.out.println(maxSubArray(nums));
        System.out.println(maxSubArray(nums1));
        System.out.println(maxSubArray(nums2));
        System.out.println(maxSubArray(nums3));
        System.out.println(maxSubArray(nums4));
        System.out.println(maxSubArray(nums5));
        System.out.println(maxSubArray(nums6));
    }
}



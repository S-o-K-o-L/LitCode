public class SearchInsert {
    public static int searchInsert(int[] nums, int target) {
        if (target < nums[0])
            return 0;
        if (target > nums[nums.length-1])
            return nums.length;




        int leftBound = 0;
        int rightBound = nums.length - 1;
        int middle;
        while (true) {

            middle = (rightBound + leftBound) / 2;
            if (target == nums[middle]) {
                return middle;
            }
            if (rightBound <= leftBound) {
                return nums[rightBound] > target ? rightBound :rightBound +1;
            }
            if (target < nums[middle]) {
                rightBound = middle - 1;
            } else {
                leftBound = middle + 1;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,7,8,9};
        int[] nums1 = {3,5,7,9,10};
        //System.out.println(searchInsert(nums,5));
        System.out.println(searchInsert(nums1,8));
    }
}

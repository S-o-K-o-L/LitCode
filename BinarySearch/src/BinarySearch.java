public class BinarySearch {
    public static int search(int[] nums, int target) {
        int leftBound = 0;
        int rightBound = nums.length - 1;
        int middle;
        while (leftBound <= rightBound) {
            middle = (rightBound + leftBound) / 2;
            if (target == nums[middle]) {
                return middle;
            }
            if (target < nums[middle]) {
                rightBound = middle - 1;
            } else {
                leftBound = middle + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(search(arr, 1));
    }
}

import java.util.Arrays;

public class MergeSortedArrays {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, nums2.length);
        }
        int[] res = new int[n + m];
        int k = 0;
        int l = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (l >= n || (nums1[k] < nums2[l] && k < m)) {
                res[i] = nums1[k];
                k++;
            } else {
                res[i] = nums2[l];
                l++;
            }
        }
        System.arraycopy(res, 0, nums1, 0, nums1.length);
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0 ,0};
        int[] nums2 = {2, 5, 6};
        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }
}

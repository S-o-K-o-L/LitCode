import java.util.*;

public class IntersectionofTwoArraysII {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> mapItemCount = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        for (Integer item : nums1) {
            if (!mapItemCount.containsKey(item))
                mapItemCount.put(item,1);
            else {
                mapItemCount.put(item, mapItemCount.get(item) + 1);
            }
        }
        for (Integer item : nums2) {
            if (mapItemCount.containsKey(item) && mapItemCount.get(item) > 0) {
                res.add(item);
                mapItemCount.put(item, mapItemCount.get(item) - 1);
            }
        }
        int[] res1 = new int[res.size()];
        int i = 0;
        for (Integer item : res) {
            res1[i] = item; i++;
        }
        return res1;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {4,9,9};
        System.out.println(Arrays.toString(intersect(nums1,nums2)));
    }
}

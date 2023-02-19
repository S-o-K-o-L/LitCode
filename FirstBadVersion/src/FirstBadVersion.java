public class FirstBadVersion {
    private static final long BAD_VERSION = 2;

    public static long firstBadVersion(int n) {
        long middle;
        long left = 1;
        long right = n;
        while (true) {
            if (left == right) {
                return left;
            }
            middle = (left + right) / 2;
            if (isBadVersion((int)middle)) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
    }

    private static boolean isBadVersion(int version) {
        return version >= BAD_VERSION;
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(3));
    }
}

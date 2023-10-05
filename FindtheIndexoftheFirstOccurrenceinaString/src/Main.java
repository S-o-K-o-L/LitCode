public class Main {
    //Given two strings needle and haystack,
    // return the index of the first occurrence of needle in haystack,
    // or -1 if needle is not part of haystack.

    public static void main(String[] args) {
        System.out.println(strStr("mississippi", "sippia"));
        System.out.println(strStr("mississippi", "issipi"));
        System.out.println(strStr("mississippi", "issip"));
        System.out.println(strStr("abc", "c"));
        System.out.println(strStr("a", "a"));
        System.out.println(strStr("hello", "ll"));
        System.out.println(strStr("sadbutsad", "sad"));
        System.out.println(strStr("leetcode", "leeto"));

    }

    public static int strStr(String haystack, String needle) {
        int haystackLength = haystack.length();
        int needleLength = needle.length();
        if (haystackLength < needleLength)
            return -1;
        for (int i = 0, j = 0; i < haystackLength; i++) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                j++;
            } else {
                i = i - j;
                j=0;
            }
            if (j == needleLength)
                return i - needleLength + 1;
        }
        return -1;
    }
}
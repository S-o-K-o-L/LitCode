import java.util.HashSet;
import java.util.Set;

class Solution {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int cs = 0;
        int cp = 0;
        char ci = 0;
        for (char c : s.toCharArray()) {
            cs += c;
            ci ^= c;
        }
        for (char c : t.toCharArray()) {
            cp += c;
            ci ^= c;
        }
        return cs == cp && ci == 0;
    }
}

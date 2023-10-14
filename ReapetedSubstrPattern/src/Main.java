public class Main {
    //Given a string s,
    //check if it can be constructed by taking
    //a substring of it and appending multiple copies of the substring together.

    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("abab"));
        System.out.println(repeatedSubstringPattern("ababa"));
        System.out.println(repeatedSubstringPattern("abc"));
        System.out.println(repeatedSubstringPattern("abcabcabc"));
    }

    public static boolean repeatedSubstringPattern(String s) {
        String doubleStr = s + s;
        return  doubleStr.substring(1,doubleStr.length()-1).contains(s);



//        char[] letters = s.toCharArray();
//        String subStr = s.substring(0, 1);
//        loop:
//        for (int i = 1; i <= s.length() / 2; i++) {
//            subStr = s.substring(0, i);
//            if (s.length() % subStr.length() != 0) {
//                continue;
//            } else {
//
//                for (int j = subStr.length(); j < s.length();) {
//                    for (int k = 0; k < subStr.length(); k++, j++) {
//                        if (subStr.charAt(k) != letters[j]) {
//                            continue loop;
//                        }
//                    }
//                }
//                return true;
//            }
//        }
//        return false;
    }
}

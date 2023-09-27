class Solution {
    //You are given two strings word1 and word2.
    //Merge the strings by adding letters in alternating order, starting with word1.
    //If a string is longer than the other, append the additional letters onto the end of the merged string.
    //Return the merged string.

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abczxc","pqwer"));
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder mergedString = new StringBuilder(word1.length() + word2.length());
        int i = 0;
        for (; i < Math.min(word1.length(), word2.length()) ; i++) {
            mergedString.append(word1.charAt(i));
            mergedString.append(word2.charAt(i));
        }
        if (word1.length() > word2.length()) {
            for (; i < word1.length(); i++) {
                mergedString.append(word1.charAt(i));
            }
        } else {
            for (; i < word2.length(); i++) {
                mergedString.append(word2.charAt(i));
            }
        }
        return mergedString.toString();
    }
}

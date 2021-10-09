package ru.dataart.academy.java;

public class LongestSubstring {
    /**
     * @param checkString - input string to check
     * @return - length of max substring without repeatable characters
     * Example: dnmdncbb  -> 5 (mdncb)
     * amam -> 2 (am)
     */

    public int getLengthOfLongestSubstring(String checkString) {

        StringBuilder longestSubstring = new StringBuilder();
        int longest = 0;
        int temp = 0;

        for(int i = 0; i < checkString.length(); i++) {
            for(int j = i; j < checkString.length(); j++) {
                int indexOfFound = longestSubstring.indexOf(String.valueOf(checkString.charAt(j)));
                if(indexOfFound == -1) {
                    longestSubstring.append(checkString.charAt(j));
                    temp++;
                } else {
                    temp = 0;
                    longestSubstring.setLength(0);
                }

                if(temp > longest) {
                    longest = temp;

                }
            }
        }

        return longest;
    }
}

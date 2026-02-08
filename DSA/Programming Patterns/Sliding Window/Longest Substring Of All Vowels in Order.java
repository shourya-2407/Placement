// Brute force
class Solution {
    public int longestBeautifulSubstring(String word) {
        int n = word.length();
        int maxLength = 0;
        if (n < 5)
            return 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 4; j < n; j++) {
                String subStr = word.substring(i, j + 1);

                if (subStr.contains("a") && subStr.contains("e") &&
                        subStr.contains("i") && subStr.contains("o") &&
                        subStr.contains("u") && isSortedAscending(subStr)) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }

        return maxLength;
    }

    private static boolean isSortedAscending(String s) {
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) < s.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }
}

// Optimised approach using sliding window
class Solution {

    public int longestBeautifulSubstring(String word) {
        int n = word.length();
        if (n < 5)
            return 0;

        int maxLength = 0, cnt = 1, vowels = 1;

        for (int i = 1; i < n; i++) {
            if(word.charAt(i) >= word.charAt(i - 1)){
                cnt++;
                if(word.charAt(i) > word.charAt(i - 1)){
                    vowels++;
                }
            } else{
                cnt = 1;
                vowels = 1;
            }
            if(vowels == 5) maxLength = Math.max(maxLength, cnt);
        }

        return maxLength;
    }
}

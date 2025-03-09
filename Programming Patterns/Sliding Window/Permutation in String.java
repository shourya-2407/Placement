// Brute Force
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        char[] arr1 = s1.toCharArray();
        Arrays.sort(arr1);

        for(int i = 0; i <= s2.length() - n; i++){
            String str = s2.substring(i, i + n);
            if(areAnagrams(str, arr1)){
                return true;
            }
        }

        return false;
    }

    private static boolean areAnagrams(String str1, char[] arr2) {
        if (str1.length() != arr2.length) return false;

        char[] arr1 = str1.toCharArray();
        Arrays.sort(arr1);

        return Arrays.equals(arr1, arr2);
    }
}

// Optimised approach using sliding window
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        if(m > n) return false;
        
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(int i = 0; i < m; i++){
            freq1[s1.charAt(i) - 'a']++;
            freq2[s2.charAt(i) - 'a']++;
        }    

        if(Arrays.equals(freq1, freq2)) {
            return true;
        }

        for(int i = m; i < n; i++){
            freq2[s2.charAt(i) - 'a']++;
            freq2[s2.charAt(i - m) - 'a']--;

            if(Arrays.equals(freq1, freq2)) {
                return true;
            }
        }

        return false;
    }
}

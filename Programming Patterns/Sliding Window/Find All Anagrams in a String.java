//Brute Force:
class Solution {

    public static boolean areAnagrams(String str1, char[] arr2) {
        if (str1.length() != arr2.length) return false;

        char[] arr1 = str1.toCharArray();
        Arrays.sort(arr1);

        return Arrays.equals(arr1, arr2);
    }

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        
        int n = p.length();
        char[] arrP = p.toCharArray();
        Arrays.sort(arrP);

        for(int i = 0; i <= s.length() - n; i++){
            String str = s.substring(i, i + n);
            if(areAnagrams(str, arrP)){
                ans.add(i);
            }
        }

        return ans;
    }
}

// Better brute force using frequency array
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int m = p.length();
        List<Integer> ans = new ArrayList<>();

        int[] pFreq = new int[26];
        for(char ch : p.toCharArray()){
            pFreq[ch - 'a']++;
        }

        for(int i = 0; i <= s.length() - m; i++){
            int[] sFreq = new int[26];
            for(int j = i; j < i + m; j++){
                sFreq[s.charAt(j) - 'a']++;
            }
            if(Arrays.equals(pFreq, sFreq)) {
                ans.add(i);
            }
        }

        return ans;
    }
}


// Optimised approach using frequency array and sliding algorithm
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int m = p.length();
        int n = s.length();
        
        if (m > n) return ans;

        int[] pFreq = new int[26];
        int[] sFreq = new int[26];
        for(int i = 0; i < m; i++){
            pFreq[p.charAt(i) - 'a']++;
            sFreq[s.charAt(i) - 'a']++;
        }

        if(Arrays.equals(pFreq, sFreq)) ans.add(0);

        for(int i = m; i < n; i++){
            sFreq[s.charAt(i - m) - 'a']--;
            sFreq[s.charAt(i) - 'a']++;

            if(Arrays.equals(pFreq, sFreq)) {
                ans.add(i - m + 1);
            }
        }

        return ans;
    }
}

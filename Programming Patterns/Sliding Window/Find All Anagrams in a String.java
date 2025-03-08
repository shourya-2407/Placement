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

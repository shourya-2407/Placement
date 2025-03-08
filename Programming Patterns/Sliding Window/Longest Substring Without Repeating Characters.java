// Brute force
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max_length = 0;
        for(int i = 0; i < s.length(); i++){
            Set<Character> set = new HashSet<>(); 
            for(int j = i; j < s.length(); j++){
                if(set.contains(s.charAt(j))){
                    break;
                }
                set.add(s.charAt(j));
                max_length = Math.max(max_length, set.size());
            }
        }

        return max_length;
    }
}

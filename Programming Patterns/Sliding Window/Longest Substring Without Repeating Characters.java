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

// Optimal Solution using sliding window
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> _map = new HashMap<>();
        int maxLength = 0;
        int left = 0;

        for(int right = 0; right < s.length(); right++){
            if(_map.containsKey(s.charAt(right))){
                left = Math.max(left, _map.get(s.charAt(right)) + 1);
            }
            
            _map.put(s.charAt(right), right);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}

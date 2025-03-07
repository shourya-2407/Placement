// Brute force, O(n2)
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(nums[i] == nums[j] && Math.abs(i - j) <= k){
                    return true;
                }
            }
        }

        return false;
    }
}

// Better approach using HashMap
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> _map = new HashMap<>();

        for(int i = 0; i < n; i++){
            if(_map.containsKey(nums[i]) && Math.abs(_map.get(nums[i]) - i) <= k){
                return true;
            }
            _map.put(nums[i], i);
        }

        return false;
    }
}

// Better approach using HashSet
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }

            set.add(nums[i]);
            if(set.size() > k){
                set.remove(nums[i - k]);
            }
        }

        return false;
    }
}

// More better approach using HashSet
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            if(set.size() > k){
                set.remove(nums[i - k - 1]);
            }           
            if(!set.add(nums[i])){
                return true;
            }
        }

        return false;
    }
}

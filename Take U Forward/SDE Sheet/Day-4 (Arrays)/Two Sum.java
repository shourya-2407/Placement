// Brute force
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}

// better solution using Hash Map
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> _map = new HashMap<>();

        for(int i = 0; i < n; i++){
            _map.put(target - nums[i], i);
        }

        for(int i = 0; i < n; i++){
            if(_map.containsKey(nums[i]) && _map.get(nums[i]) != i){
                return new int[]{i, _map.get(nums[i])};
            }
        }

        return new int[]{};
    }
}

//Fastest approach apparently using brute force:
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int finish = n - 1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                } else if (nums[finish - i] + nums[finish - j] == target) {
                    return new int[]{finish - i, finish - j};
                }
            }
        }
        return new int[]{};
    }
   }

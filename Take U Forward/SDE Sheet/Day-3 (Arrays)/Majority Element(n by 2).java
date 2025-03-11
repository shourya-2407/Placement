// Intuition: 
// If you dedicate a pointer to count number of occurrence of an element 
// If you inc the counter for every occurrence of element, reduce every time some other element occurs
// Logic: If the counter is greater than 1 then the element dominates. so that is the majority element.

// Java:
class Solution {
    public int majorityElement(int[] nums) {
        int max_ele = 0;
        int cnt = 0;

        for(int i = 0; i < nums.length; i++){
            if(cnt == 0){
                max_ele = nums[i];
            }
            if(nums[i] == max_ele){
                cnt++;
            } else{
                cnt--;
            }
        }

        return max_ele;
    }
}

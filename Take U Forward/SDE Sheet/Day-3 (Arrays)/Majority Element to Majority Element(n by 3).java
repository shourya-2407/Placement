// Algorithm:
// The first trick lies in identifying that *at max* (1 or 2, so re-verify after finding the elements) there can be only 2 elements that occur more than n/3
// Next iterate with 2 pointers making sure that they don't point the same element.

// Java:
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1 = 0;
        int cnt2 = 0;
        int ele1 = 0;
        int ele2 = 0;

        int minReq = (int)nums.length/3;

        for(int i = 0; i < nums.length; i++){
            if(cnt1 == 0 && nums[i] != ele2){
                ele1 = nums[i];
                cnt1++;
            } else if(cnt2 == 0 && nums[i] != ele1){
                ele2 = nums[i];
                cnt2++;
            } else if(nums[i] == ele1){
                cnt1++;
            } else if(nums[i] == ele2){
                cnt2++;
            } else{
                cnt1--;
                cnt2--;
            }
        }

        List<Integer> ls = new ArrayList<>();
        cnt1 = 0;
        cnt2 = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == ele1){
                cnt1++;
            } else if(nums[i] == ele2){
                cnt2++;
            }
        }
        if(cnt1 > minReq){
            ls.add(ele1);
        }
        if(cnt2 > minReq){
            ls.add(ele2);
        }

        return ls;
    }
}

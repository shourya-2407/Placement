// Learnings: 
// Arrays can be sorted from a particular index as well. 
// Arrays.sort(arr, ind1, ind2); (Not used here though due to time complexity, instead used reverse)


// Algorithm: 
// - Firstly from the behind, find where the ascending gradient is broken.
// - Store the index and find the value that can replace that index.
// - Then sort the array after the index.


// Java:
class Solution {
    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
        return;
    }

    void reverseArray(int[] nums,int start){
        int i=start;
        int j=nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }

    public void nextPermutation(int[] nums) {
        int index = -1;
        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i] < nums[i + 1]){
                index = i;
                break;
            }
        }
        if(index == -1){
            reverseArray(nums, 0);
            return;
        }
        for(int i = nums.length - 1; i >= index; i--){
            if(nums[i] > nums[index]){
                swap(nums, i, index);
                break;
            }
        }
        reverseArray(nums, index + 1);
        return;
    }
}

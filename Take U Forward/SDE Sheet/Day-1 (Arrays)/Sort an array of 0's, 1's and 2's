/* Dutch National Flag Algorithm */
// Logic
// Consider 3 flags => low, mid, high
// A hypothetical array: 
// 0 to low-1 => zeros
// low to mid-1 => ones
// mid to high-1 => unsorted array
// high to n-1 => twos
// so consider the given array as an array from mid to high-1 
// and try to place it in the right position

// Optimised:
class Solution {
    public void swap(int[]nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0;
        int mid = 0;
        int high = n - 1;

        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums,mid,low);
                low++;
                mid++;
            } else if(nums[mid] == 1){
                mid++;
            } else if(nums[mid] == 2){
                swap(nums,mid,high);
                high--;
            }
        }
    }
}


// Better
class Solution {
    public void sortColors(int[] nums) {
        int cntZeros = 0;
        int cntOnes = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                cntZeros++;
            }
            if(nums[i] == 1){
                cntOnes++;
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(i < cntZeros){
                nums[i] = 0;
            } 
            else if(i < cntZeros + cntOnes){
                nums[i] = 1;
            }
            else{
                nums[i] = 2;
            }
        }
    }
}

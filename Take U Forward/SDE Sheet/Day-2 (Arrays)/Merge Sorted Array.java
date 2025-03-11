// Learning: 
// Solution using 2 pointers
// No need to replace i and j values with zero, because anyways the value later is handled by k and will be over written

// Java: 
// Optimised Solution:
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while(j >= 0){
            if(i >= 0 && nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            } else{
                nums1[k--] = nums2[j--];
            }
        }
    }
}



// Java: 
// Your solution:  (You were close enough sweety!)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while(i >= 0 && j >= 0){
            if(nums1[i] >= nums2[j]){
                nums1[k--] = nums1[i];
                nums1[i--] = 0;
            }else{
                nums1[k--] = nums2[j];
                nums2[j--] = 0; 
            }
        }

        for(int r = 0; r < nums1.length; r++){
            // System.out.println(r);
            System.out.println(nums1[r]);
        }
        
        for(int r = 0; r < nums1.length; r++){
            if(nums1[r] == 0){
                nums1[r] = nums2[r];
            }
            else{
                break;
            }
        }
    }
}

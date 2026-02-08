// Using 2 pointers
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

// Best approach using 2 pointers the trick was to understand that the array needs to be updated from behind
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1, p2 = n - 1, p = m + n - 1;

        while(p1 >= 0 && p2 >= 0){
            if(nums1[p1] < nums2[p2]){
                nums1[p--] = nums2[p2--];
            } else {
                nums1[p--] = nums1[p1--];
            }
        }

        while(p1 >= 0){
            nums1[p--] = nums1[p1--];
        }

        while(p2 >= 0){
            nums1[p--] = nums2[p2--];
        }
    } 
}

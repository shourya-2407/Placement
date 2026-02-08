class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        long low = 0;
        return mergeSort(arr, low, N - 1);
    }
    
    static long mergeSort(long arr[], long low, long high){
        if(low >= high){
            return 0;
        }
        
        long mid = (low + high)/2;
        long cnt = 0;
        
        cnt += mergeSort(arr, low, mid);
        cnt += mergeSort(arr, mid + 1, high);
        cnt += mergeSortedArrays(arr, low, mid, high);
        
        return cnt;
    }
    
    static long mergeSortedArrays(long arr[], long low, long mid, long high){
        long i = low;
        long j = mid + 1;
        long cnt = 0;
        List<Long> tmp = new ArrayList<>();
        
        while(i <= mid && j <= high){
            if(arr[(int)i] <= arr[(int)j]){
                tmp.add(arr[(int)i]);
                i++;
            } else{
                tmp.add(arr[(int)j]);
                cnt += mid - i + 1;
                j++;
            }
        }
        
        while(i <= mid){
            tmp.add(arr[(int)i]);
            i++;
        } 
            
        while(j <= high){
            tmp.add(arr[(int)j]);
            j++;
        }
        
        for(int k = (int)low; k <= high; k++){
            arr[k] = tmp.get(k - (int)low);
        }
        
        return cnt;
    }

}

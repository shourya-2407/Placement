March 4th: DSA & Java Core

1️⃣ DSA (Solve 4-5 questions)
Topics: Arrays & Strings, Linked List Questions:
* Easy:
    * Find the second largest element in an array
      
   Brute Force:
   class Solution {
        public int getSecondLargest(int[] arr) {
           // Code Here
           int n = arr.length;
           Set<Integer> set = new HashSet<>();
           
           for(int i = 0; i < n; i++){
               set.add(arr[i]);
           }
           
           List<Integer> list = new ArrayList<Integer>(set); 
           Collections.sort(list, Collections.reverseOrder());
           
           if(list.size() < 2) return -1;
           
           return list.get(1);
       }
   }

   Better Brute Force:
   class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int n = arr.length;
        
        Arrays.sort(arr);
        int largestEle = arr[n - 1];
        
        for(int i = n - 2; i >= 0; i--){
            if(arr[i] != largestEle) return arr[i];
        }
        
        return -1;
     }
   }

   Optimized using 2 pointers:
   class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for(int i = 0; i < n; i++) {
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        
        return (secondLargest != Integer.MIN_VALUE) ? secondLargest : -1 ;
     }
   }
   
    * Reverse a linked list (iterative & recursive)
* Medium:
    * Two Sum (LeetCode #1)
    * Longest Substring Without Repeating Characters (LeetCode #3)
* Hard (Optional):
    * Trapping Rain Water (LeetCode #42)


2️⃣ Java Core
Topics: OOPs & Collections
* Explain Polymorphism with a real-world example
* How does HashMap work internally? (Load factor, rehashing)
* Difference between List, Set, and Map

✅ Practice Task:
Write a Java program demonstrating method overloading & method overriding.

March 4th: DSA & Java Core

1️⃣ DSA (Solve 4-5 questions)
Topics: Arrays & Strings, Linked List Questions:
Optimisation techniques: 
1. HashMap: 
2. Two pointers: Sorted Array or Linked List, searching for pairs or triplets, Maximizing/Minimizing Something, Comparing or Merging Two Lists.
3. Sliding Window:
   
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

   Brute Force:
   class Solution {
    public ListNode reverseList(ListNode head) {
        ArrayList<Integer> nodeList = new ArrayList<>();

        ListNode newHead = head;
        while(newHead != null){
            nodeList.add(newHead.val);
            newHead = newHead.next;
        }

        Collections.reverse(nodeList);

        int i = 0;
        newHead = head;
        while(newHead != null){
            newHead.val = nodeList.get(i);
            i++;
            newHead = newHead.next;
        }
        return head;
     }
   }

   Better Brute Force:
   class Solution {
    public ListNode reverseList(ListNode head) {
        
        if (head == null || head.next == null) return head;
        
        ArrayList<ListNode> nodeList = new ArrayList<>();

        while(head != null){
            nodeList.add(head);
            head = head.next;
        }

        for(int i = nodeList.size() - 1; i > 0; i--){
            nodeList.get(i).next = nodeList.get(i - 1);
        }
        nodeList.get(0).next = null;

        return nodeList.get(nodeList.size() - 1);
     }
   }

   Optimised Iterative using 2 pointers:
   class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode rev = null;
        ListNode next;

        while(head != null){
            next = head.next;
            head.next = rev;
            rev = head;
            head = next;
        }

        return rev;
    }
   }

   Optimised recursive:


* Medium:
    * Two Sum (LeetCode #1)

   Brute Force:
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

   Optimized Approach using HashMap: 
   class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> _map = new HashMap<>();

        for(int i = 0; i < n; i++){
            if(_map.containsKey(nums[i]) && _map.get(nums[i]) != i){
                return new int[]{i, _map.get(nums[i])};
            }
            _map.put(target - nums[i], i);
        }

        return new int[]{};
    }
   }

   Fastest approach apparently using brute force:
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

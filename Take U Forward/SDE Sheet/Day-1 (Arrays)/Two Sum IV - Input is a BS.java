// Brute Force:
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> nums = new ArrayList<>();
        
        inorder(root, nums);

        for(int i = 0; i < nums.size(); i++){
            for(int j = i + 1; j < nums.size(); j++){
                if(nums.get(i) + nums.get(j) == k){
                    return true;
                }
            }
        }

        return false;
    }

    public void inorder(TreeNode root, ArrayList<Integer> nums){
        if(root == null) return;

        inorder(root.left, nums);
        nums.add(root.val);
        inorder(root.right, nums);
    }
}

// Better Approach:
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> nodeSet = new HashSet<>();

        return inorder(root, k, nodeSet);
    }

    public boolean inorder(TreeNode root, int k, HashSet<Integer> nodeSet) {
        if(root == null) return false;

        if(nodeSet.contains(k - root.val)) return true;
        
        nodeSet.add(root.val);
        return inorder(root.left, k, nodeSet) || inorder(root.right, k, nodeSet);
    }
}

// More Better using 2 pointers:
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> nums = new ArrayList<>();

        inorder(root, nums);

        int left = 0;
        int right = nums.size() - 1;
        while(left < right){
            if(nums.get(left) + nums.get(right) > k){
                right--;
            } else if(nums.get(left) + nums.get(right) < k){
                left++;
            } else {
                return true;
            }
        }

        return false;
    }

    public void inorder(TreeNode root, List<Integer> nums){
        if(root == null) return;

        inorder(root.left, nums);
        nums.add(root.val);
        inorder(root.right, nums);
    }
}

/*
| Approach                                | TC    | SC   |
|-----------------------------------------|-------|------|
| Morris Traversal (Best Space Optimized) | O(N)  | O(1) |
| Two Pointers + Inorder Array            | O(N)  | O(N) |
| HashSet (Your Original Approach)        | O(N)  | O(N) |
| Brute Force (Nested Loops)              | O(N²) | O(N) |
*/


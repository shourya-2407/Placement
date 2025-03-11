// *Optimal Solution*
// LOGIC:
// each element position = nCr (n = row - 1, r = col - 1)
// ele = previous ele * (row - col)/(col)

class Solution {
    public List<Integer> generateRow(int row){
        List<Integer> currRow = new ArrayList<>();
        int currEle = 1;
        currRow.add(currEle);

        for(int col = 1; col < row; col++){
           currEle = currEle * (row - col);
           currEle = currEle / col;
           currRow.add(currEle);
        }
        return currRow;
    }
    
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 1; i <= numRows; i++){
            List<Integer> currRow = generateRow(i);
            ans.add(currRow);
        }
        return ans;
    }
}


// *Brute Force*
// Learnings:
// This is how u can handle questions with list of lists.

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<List<Integer>>();
      
	    if (numRows <= 0)  return output;    
	    ArrayList<Integer> prev = new ArrayList<Integer>();
	    prev.add(1);
	    output.add(prev);

	    for (int i = 2; i <= numRows; i++) {
		    ArrayList<Integer> curr = new ArrayList<Integer>();
		    curr.add(1);    
        
		    for (int j = 1; j < prev.size(); j++) {
			    curr.add(prev.get(j - 1) + prev.get(j));    
		    }

		    curr.add(1);    
		    output.add(curr);

		    prev = curr;
	    }
	    return output;     
    }
}

// Learnings: 
// 1. Java Arraylists don't have default values.
// 2. Set method for arraylist => public E set(int index, E element)

// Optimum Solution (Java): 
class Solution {
    public void setZeroes(int[][] matrix) {
        int col0 = 1;
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 0){
                    if(j == 0){
                        col0 = 0;  
                    } else{
                        matrix[0][j] = 0; 
                        matrix[i][0] = 0;
                    }
                } 
            }
        }
        
        for(int i = m - 1; i >= 0; i--){
            for(int j = n - 1; j >= 0; j--){
                if(j == 0){
                    if(col0 == 0)
                        matrix[i][j] = 0; 
                }
                else if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}



// Solution using extra space (Java): 
class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> zeroRows = new ArrayList<>();
        ArrayList<Integer> zeroColumns = new ArrayList<>();

        for(int i = 0; i < matrix.length; i++){
            zeroRows.add(0);
        }

        for(int i = 0; i < matrix[0].length; i++){
            zeroColumns.add(0);
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    zeroRows.set(i, 1);
                    zeroColumns.set(j, 1);
                } 
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(zeroRows.get(i) == 1 || zeroColumns.get(j) == 1){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> matrixArr= new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        int top=0, bottom = rows-1, left=0, right=cols-1;
        int dir=1;
        while(top<= bottom && left<=right){
            if(dir==1){
                for(int i=left; i<=right; ++i){
                    matrixArr.add(matrix[top][i]);
                }
                ++top;
                dir=2;
            }
            else if(dir==2){
                for(int i=top; i<=bottom; ++i){
                    matrixArr.add(matrix[i][right]);
                }
                --right;
                dir=3;
            }
            else if(dir==3){
                for(int i=right; i>=left; --i){
                    matrixArr.add(matrix[bottom][i]);
                }
                --bottom;
                dir=4;
            }
            else if(dir == 4){
                for(int i=bottom; i>=top; --i){
                    matrixArr.add(matrix[i][left]);
                }
                ++left;
                dir=1;
            }
        }
        return matrixArr;
    }
}
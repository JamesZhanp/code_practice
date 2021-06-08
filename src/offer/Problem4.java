package offer;

/**
 * @author: JamesZhan
 * @create: 2021 - 04 - 24 22:51
 */
public class Problem4 {

    public static boolean findNumberIn2DArray(int[][] matrix, int target){
        int length = matrix.length;
        if (length == 0){
            return false;
        }
        int row_len = matrix[0].length;

        int i = 0, j = row_len - 1;
        if (target < matrix[0][0]){
            return false;
        }
        if (target > matrix[length - 1][row_len - 1]){
            return false;
        }

        while(i < length &&  j <row_len){
            if (matrix[i][j] == target){
                return true;
            }else if(matrix[i][j] < target){
                i++;
                j = row_len - 1;
                if (j < 0){
                    return false;
                }
            }else{
                j = j - 1;
                if (j < 0){
                    return false;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,4,7},{2,5,8},{3,6,9}};
        int[][] matrix2 = {};
        System.out.println(findNumberIn2DArray(matrix,4));
        System.out.println(findNumberIn2DArray(matrix,5));
        System.out.println(findNumberIn2DArray(matrix,11));
        System.out.println(findNumberIn2DArray(matrix,0));
        System.out.println(findNumberIn2DArray(matrix2,1));
    }
}

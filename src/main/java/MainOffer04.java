/*
 * 二维数组中的查找(这次的时间复杂度还是很不错的)
 *因为有序所有可以按照这些顺序进行比较比目标值大就让列数--
 * 小于就行数++
 * */
public class MainOffer04 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};
        int target = 20;


        System.out.println(findNumberIn2DArray(matrix, target));
    }

    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int column = matrix[0].length;
        int row = 0;
        int col = column - 1;
        while (row < rows && col >=0) {
            if (target == matrix[row][col]) {
                return true;
            } else if (target < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
}

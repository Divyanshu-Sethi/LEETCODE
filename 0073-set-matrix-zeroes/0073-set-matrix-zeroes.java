// class Solution {
//     public void setZeroes(int[][] arr) {
//         int m = arr.length;
//         int n = arr[0].length;

//         for (int i = 0; i < m; ++i) {
//             for (int j = 0; j < n; ++j) {
//                 if (arr[i][j] == 0) {
//                     int row = i;
//                     int col = j;

//                     for (int k = 0; k < n; ++k) {
//                         if (arr[row][k] != 0) arr[row][k] = -1;
//                     }

//                     for (int l = 0; l < m; ++l) {
//                         if (arr[l][col] != 0) arr[l][col] = -1;
//                     }
//                 }
//             }
//         }

//         for (int i = 0; i < m; ++i) {
//             for (int j = 0; j < n; ++j) {
//                 if (arr[i][j] == -1) {
//                     arr[i][j] = 0;
//                 }
//             }
//         }
//     }
// }
class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        // Step 1: Mark rows and columns
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        // Step 2: Set to zero where needed
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}

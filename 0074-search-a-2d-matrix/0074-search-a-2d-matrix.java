class Solution {
    // Binary Search within the row
    public boolean searchinrow(int[][] arr, int tar, int row) {
        int n = arr[0].length;
        int start = 0, end = n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (tar == arr[row][mid]) {
                return true;
            } else if (tar < arr[row][mid]) {
                end = mid - 1; // Move the end pointer to mid - 1
            } else {
                start = mid + 1; // Move the start pointer to mid + 1
            }
        }

        return false;
    }

    // Binary Search to find the correct row, then use searchinrow
    public boolean searchMatrix(int[][] arr, int target) {
        int m = arr.length;
        int n = arr[0].length;

        int startrow = 0, endrow = m - 1;
        
        while (startrow <= endrow) {
            int midrow = (startrow + endrow) / 2;

            // Check if the target is within the current row range
            if (target >= arr[midrow][0] && target <= arr[midrow][n - 1]) {
                return searchinrow(arr, target, midrow);
            } else if (target < arr[midrow][0]) {
                endrow = midrow - 1; // Search in the upper half
            } else {
                startrow = midrow + 1; // Search in the lower half
            }
        }

        return false; // Target not found in any row
    }
}

class Solution {
    public int removeDuplicates(int[] arr) {
        Arrays.sort(arr); // Sort array first
        int j = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        return j + 1; // Return new array length
    }
}

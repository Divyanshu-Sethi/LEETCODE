class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int piv = -1;

        // Step 1: Find pivot
        for (int i = n - 2; i >= 0; --i) {
            if (nums[i] < nums[i + 1]) {
                piv = i;
                break;
            }
        }

        // Step 2: If no pivot, reverse the entire array
        if (piv == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // Step 3: Find the next greater element from end and swap
        for (int i = n - 1; i > piv; --i) {
            if (nums[i] > nums[piv]) {
                int temp = nums[i];
                nums[i] = nums[piv];
                nums[piv] = temp;
                break;
            }
        }

        // Step 4: Reverse the part after pivot
        reverse(nums, piv + 1, n - 1);
    }

    // Helper function to reverse part of array
    private void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}

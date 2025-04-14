import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;

        for (int i = 0; i < n; ++i) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            for (int j = i + 1; j < n; ++j) {
                if (j > i + 1 && arr[j] == arr[j - 1]) continue;

                int p = j + 1, q = n - 1;
                while (p < q) {
                    long sum = (long) arr[i] + arr[j] + arr[p] + arr[q]; // to avoid int overflow

                    if (sum < target) {
                        p++;
                    } else if (sum > target) {
                        q--;
                    } else {
                        result.add(Arrays.asList(arr[i], arr[j], arr[p], arr[q]));
                        p++;
                        q--;

                        while (p < q && arr[p] == arr[p - 1]) p++; // skip duplicate p
                        while (p < q && arr[q] == arr[q + 1]) q--; // skip duplicate q
                    }
                }
            }
        }

        return result;
    }
}

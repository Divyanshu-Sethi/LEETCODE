class Solution {
    public void sortColors(int[] arr) {
        int red = 0;
        int white = 0;
        int blue = 0;

        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == 0) {
                red++;
            } else if (arr[i] == 1) {
                white++;
            } else if (arr[i] == 2) {
                blue++;
            }
        }
            int index=0;

        for (int i = 0; i < red; ++i) {
            arr[index++] = 0;
        }
        for (int i = 0; i < white; ++i) {
            arr[index++] = 1;
        }
        for (int i = 0; i < blue; ++i) {
            arr[index++] = 2;
        }
    }
}

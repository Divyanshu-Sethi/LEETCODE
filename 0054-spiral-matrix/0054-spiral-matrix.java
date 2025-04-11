class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int sr = 0, sc = 0;
        int er = arr.length - 1;
        int ec = arr[0].length - 1;
        int m = arr.length;
        int n = arr[0].length;
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();

        while (count < m * n) {
            // Left to Right
            for (int i = sc; i <= ec && count < m * n; ++i) {
                list.add(arr[sr][i]);
                count++;
            }
            sr++;

            // Top to Bottom
            for (int i = sr; i <= er && count < m * n; ++i) {
                list.add(arr[i][ec]);
                count++;
            }
            ec--;

            // Right to Left
            for (int i = ec; i >= sc && count < m * n; --i) {
                list.add(arr[er][i]);
                count++;
            }
            er--;

            // Bottom to Top
            for (int i = er; i >= sr && count < m * n; --i) {
                list.add(arr[i][sc]);
                count++;
            }
            sc++;
        }

        return list;
    }
}

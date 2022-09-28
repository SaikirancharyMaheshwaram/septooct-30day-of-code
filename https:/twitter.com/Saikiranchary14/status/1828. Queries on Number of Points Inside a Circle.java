class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] ans = new int[queries.length];
        int i = 0;
        for (int[] query : queries) {
            int x1 = query[0], y1 = query[1], r = query[2];
            for (int[] point : points) {
                int x = point[0], y = point[1];
                int dx = x - x1, dy = y - y1;
                if (dx * dx + dy * dy <= r * r) {
                    ans[i]++;
                }
            }
            i++;
        }
        return ans;
    }
}

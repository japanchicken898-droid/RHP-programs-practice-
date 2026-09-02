class Solution {
    private int find(int[] ldr, int node) {
        if (ldr[node] != node) {
            ldr[node] = find(ldr, ldr[node]); }
        return ldr[node];
    }

    private void join(int[] ldr, int u, int v) {
        int rootU = find(ldr, u);
        int rootV = find(ldr, v);
        if (rootU != rootV) {
            ldr[rootU] = rootV;
        }
    }

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int[] ldr = new int[n];

        for (int i = 0; i < n; i++) {
            ldr[i] = i;
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (isConnected[i][j] == 1) {
                    join(ldr, i, j);
                }
            }
        }

        int provinces = 0;
        for (int i = 0; i < n; i++) {
            if (ldr[i] == i) {
                provinces++;
            }
        }

        return provinces;
    }
}
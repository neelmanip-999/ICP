class Solution {
    public int[] movesToStamp(String stamp, String target) {
        char[] S = stamp.toCharArray();
        char[] T = target.toCharArray();
        int n = T.length, m = S.length;
        boolean[] visited = new boolean[n];
        List<Integer> ans = new ArrayList<>();
        int stars = 0;

        while (stars < n) {
            boolean changed = false;

            for (int i = 0; i <= n - m; i++) {
                if (!visited[i] && canReplace(T, i, S)) {
                    stars = replace(T, i, m, stars);
                    visited[i] = true;
                    changed = true;
                    ans.add(i);
                    if (stars == n) break;
                }
            }

            if (!changed) return new int[0];
        }

        int[] res = new int[ans.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = ans.get(ans.size() - 1 - i);
        }
        return res;
    }

    private boolean canReplace(char[] T, int pos, char[] S) {
        for (int i = 0; i < S.length; i++) {
            if (T[pos + i] != '*' && T[pos + i] != S[i]) return false;
        }
        return true;
    }

    private int replace(char[] T, int pos, int m, int stars) {
        for (int i = 0; i < m; i++) {
            if (T[pos + i] != '*') {
                T[pos + i] = '*';
                stars++;
            }
        }
        return stars;
    }
}

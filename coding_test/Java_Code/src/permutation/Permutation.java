package permutation;

import java.util.Arrays;

public class Permutation {
    public static int solve(int a[], int n) {
        if(a.length != n) return 0;

        boolean[] vis = new boolean[n + 1];
        Arrays.fill(vis, false);
        for(int num : a) {
            if(num > n) return 0;
            if(vis[num]) {
                return 0;
            }
            vis[num] = true;
        }
        return 1;
    }

}

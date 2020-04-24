package rotate;

public class RotateArray {
    public static int[] solve(int a[], int n, int k) {
        if(a == null || a.length == 0) return a;
        //reverse all
        reverse(a, 0, n - 1);
        //reverse first k
        reverse(a, 0, k - 1);
        //reverse last n - k
        reverse(a, k, n - 1);
        return a;
    }

    public static void reverse(int a[], int l, int r) {
        if(l >= r) return;
        for(int i = 0; i <= (r - l) / 2; i++) {
            swap(a, l + i, r - i);
        }
    }

    public static void swap(int a[], int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}

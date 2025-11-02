import java.util.*;
public class Q02_B_1341_NastyaAndDoor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            int[] pre = new int[n];
            for (int i = 1; i < n - 1; i++)
                pre[i] = pre[i - 1] + ((a[i] > a[i - 1] && a[i] > a[i + 1]) ? 1 : 0);
            pre[n - 1] = pre[n - 2];
            int max = -1, idx = 0;
            for (int i = 0; i + k - 1 < n; i++) {
                int l = i, r = i + k - 1;
                int peaks = pre[r - 1] - pre[l];
                if (peaks > max) {
                    max = peaks;
                    idx = i;
                }
            }
            System.out.println((max + 1) + " " + (idx + 1));
        }
    }
}

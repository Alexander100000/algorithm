import java.util.Arrays;
import java.util.Comparator;

/*
 *宽度进行升序， 高度进行降序(难度有点大)
 *
 *
 *
 * */
public class Main354 {
    public static void main(String[] args) {
        System.out.println(maxEnvelopes(new int[][]{{5,4},{6,4},{6,7},{2,3}}));
    }

    public static int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, new Comparator<int[]>() {

            @Override
            public int compare(int[] a, int[] b) {
                return a[0] == b[0] ? b[1] - a[1] : a[0] - b[0];
            }
        });
        int[] height = new int[envelopes.length];
        for (int i = 0; i < envelopes.length; i++) {
            height[i] = envelopes[i][1];
        }
        return leftEnvelopes(height);
    }

    private static int leftEnvelopes(int[] height) {
        int pr = 0, pid = height.length;
        int[] pre = new int[pid];
        for (int i = 0; i < pid; i++) {
            int pok = height[i];
            int left = 0, right = pr;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (pre[mid] >= pok) {
                    right = mid;
                } else
                    left = mid + 1;
                }
                if (left == pr) pr++;
                pre[left] = pok;
            }

        return pr;
    }
}

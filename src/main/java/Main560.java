import java.util.HashMap;
/*
* 和为K的子数组,前缀和类次
*
*
* */
public class Main560 {
    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1, 2, 3}, 3));
        System.out.println(subarraySum1(new int[]{1, 1, 1}, 2));
    }

    public static int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int[] sub = new int[n + 1];
        sub[0] = 0;
        for (int i = 0; i < n; i++)
            sub[i + 1] = sub[i] + nums[i];
        int res = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (sub[i] - sub[j] == k) {
                    res++;
                }

            }
        }
        return res;
    }

    public static int subarraySum1(int nums[], int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap();
        map.put(0, 1);
        int sum1 = 0, res = 0;
        for (int i = 0; i < n; i++) {
            int sum2 = 0;
            sum1 += nums[i];
            sum2 = sum1 - k;
            if (map.containsKey(sum2))
                res += map.get(sum2);
                map.put(sum1, map.getOrDefault(sum1, 0) + 1);

        }
        return res;
    }
}



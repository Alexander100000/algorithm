
import java.util.HashSet;
import java.util.Set;

public class MainOffer119 {
    public static void main(String[] args) {

        System.out.println(longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
    }

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
//        进行去重
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        int max = 0;
        for (int i : set) {
            if (!set.contains(i - 1)) {
                int start = i;
                int mas = 1;
//               如果没有
                while (set.contains(start+1)) {
                    start += 1;
                    mas += 1;
                }
                max = Math.max(max, mas);
            }


        }
        return max;
    }
}


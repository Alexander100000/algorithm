
import java.util.Arrays;

/*
* 寻找数组的中心下标（意思就是找左边的元素之和等于右边的元素之和之间搁着一个元素,{1,2,1}这种的中心下标是2）
*强烈推荐画图做演示一做演示就会懂
*
* */
public class Main724 {
    public static void main(String[] args) {
        int[]nums={2,1,-1};
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {
        int sum1 = 0;
//        求数组内元素的和
//        这个的时间复杂度比直接用for循环累计的要高很多
        int sum = Arrays.stream(nums).sum();

        for (int i = 0; i < nums.length; i++) {
//            累加拿到数组中元素的和
            sum1 += nums[i];
            if (sum == sum1) {
                return i;
            }
            sum = sum - nums[i];
        }
        return -1;
    }
}

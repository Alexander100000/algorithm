/*
* 删除有序数组中的重复项 II
*建议画图演示
*
* */
public class Main80 {
    public static void main(String[] args) {
        int nums[] = {1, 1, 1, 2, 2, 3};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) {
            return n;
        }
//        因为前两个元素要么相等要么不相等，但是都可以输出掉所以可以从第三个元素开始相等的时候移动快指针，不相等的时候两个指针都移动
        int slow = 2, fast = 2;
        while (fast < n) {
            if (nums[slow - 2] != nums[fast]) {
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        return slow;
    }
}

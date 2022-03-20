
/*
* 删除有序数组中的重复项,使用双指针（快慢指针）
*
* */
public class Main26 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if(nums.length==0)return 0;
        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k]) {
                k++;
                nums[k] = nums[i];
            }

        }

//因为算的是长度所以要加一
        return  k+1;
    }
}

/*
* 三角形最大的面积
*
* */
import java.util.Arrays;

public class Main976 {
    public static void main(String[] args) {
        System.out.println(largestPerimeter(new int[]{1,2,3}));
    }
    public static int largestPerimeter(int[] nums) {
        if(nums.length==0)return 0;
        Arrays.sort(nums);
       for(int i=nums.length-1;i>=2;i--){
            if(nums[i-1]+nums[i-2]>nums[i]){
                return nums[i-1]+nums[i-2]+nums[i];
            }
       }
       return  0;
    }
}

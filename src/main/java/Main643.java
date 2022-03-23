/*
* 求子数组最大的平均数(滑动窗口)
*
* */

public class Main643 {
    public static void main(String[] args) {
        int []nums={1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(nums,4));
    }
    public static double findMaxAverage(int[] nums,int k) {
        int sum=0;
        for(int i=0;i<k;i++){
           sum+=nums[i];
        }
        int max=sum;
       for(int i=k;i<nums.length;i++){
           sum=sum-nums[i-k]+nums[i];
           max=Math.max(sum,max);
       }
        return 1.0*max/k;
    }
}

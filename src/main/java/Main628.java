import java.util.Arrays;

public class Main628 {
    public static void main(String[] args) {
        int[]nums={1,2,3};
        System.out.println(maximumProduct(nums));
        System.out.println(max(nums));
    }
//    先排序然后在找出最大的乘积
    public static int maximumProduct(int[] nums){
        Arrays.sort(nums);
        int n=nums.length;
        return Math.max(nums[0]*nums[1]*nums[n-1],nums[n-1]*nums[n-2]*nums[n-3]);
    }
//    线性扫描
    public static int max(int[] nums){
//       最小的值
        int min1=Integer.MAX_VALUE;
//        第二小的值
        int min2=Integer.MAX_VALUE;
//        第一大的值
        int max1=Integer.MIN_VALUE;
//        第二大的值
        int max2=Integer.MIN_VALUE;
//        第三大的值
        int max3=Integer.MIN_VALUE;
        for(int x:nums){
            if(x<min1){
                min2=min1;
                min1=x;
            }else if(x<min2){
                 min2=x;
            }if(x>max1){
                max3=max2;
                max2=max1;
                max1=x;
            }else if(x>max2){
                max3=max2;
                max2=x;
            }else if(x>max3){
                max3=x;
            }
        }
        return Math.max(max1*max2*max3,min1*min2*max1);
    }
}

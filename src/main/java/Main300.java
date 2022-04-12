import java.util.Arrays;
/*
* 一维dp
*
*
* */
public class Main300 {
    public static void main(String[] args) {
        System.out.println(lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
    }
    public static int lengthOfLIS(int[] nums){
        if(nums.length==0)return 0;
        int []dp=new int[nums.length+1];
//         dp数组里面的所有位置填充1
            Arrays.fill(dp,1);
        for(int i=1;i<nums.length;i++){
            for (int j=0;j<i;j++){

                if(nums[i]>nums[j]){
                   dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        int res=0;
        for(int i=0;i<dp.length;i++){
            res=Math.max(res,dp[i]);
        }
        return res;
    }
}

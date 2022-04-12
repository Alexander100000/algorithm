import java.util.Arrays;
/*
* 取巧的一个方法(利用穷举的思维)开心的一天（这些算法难不倒我）。
*
* */
public class MainHot04 {
    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1,3},new int[]{2,7} ));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
            if(nums1.length==0&&nums2.length==0){
                return 0; }
            int n=nums1.length,m=nums2.length;
            int[] nums3=new int[n+m];
           System.arraycopy(nums1,0,nums3,0,n);
           System.arraycopy(nums2,0,nums3,n,m);
           Arrays.sort(nums3);
           if(nums3.length%2==1){
               int a=nums3.length/2;
               double mid=(double) nums3[a-1];
               return mid;
           }
            int b=nums3.length/2;
            double mid=(double) (nums3[b]+nums3[b-1])/2 ;
            return mid;

           }
    }


public class Main704 {
    public static void main(String[] args) {
        System.out.println(search(new int[]{-1,0,3,5,9,12},9));
    }
    public static int search(int[] nums, int target) {
//       为了定数组遍历的区间所以（所有的都是闭区间）
         int left=0;
         int right=nums.length-1;
         while(left<=right){
//            为了避免出现越界问题
             int mid=left+(right-left)/2;
             if(nums[mid]==target){
                 return mid;
             }else if(nums[mid]>target){
                 right=mid-1;
             }else if(nums[mid]<target){
                 left=mid+1;
             }
         }
         return -1;
    }
}

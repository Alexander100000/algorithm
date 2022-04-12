public class Main35 {
    public static void main(String[] args) {
        System.out.println( searchInsert(new int[]{1,3,5,6},2));
    }
    public static int searchInsert(int[] nums, int target) {
        return leftSearchInsert(nums,target);
    }

    private static int leftSearchInsert(int[] nums, int target) {
        if(nums.length==0)return 0;
        int right=nums.length,left=0;
        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                right =mid;
            }else if(nums[mid]<target){
                left=mid+1;
            }else if(nums[mid]>target){
                right=mid;
            }
        }
        return left;
    }
    }


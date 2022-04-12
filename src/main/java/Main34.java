import java.util.Arrays;

public class Main34 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(searchRange(new int[]{5,7,7,8,8,10},8)));
    }

    public static int[] searchRange(int[] nums, int target) {
        return new int[]{leftSearch(nums, target), rightSearch(nums, target)};
    }

    public static int rightSearch(int[] nums, int target) {
        int right = nums.length - 1;
        int left = 0;
//                  如果不存在会被减到-1
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            }
        }
        if (right<0 || nums[right] != target) {
            return -1;
        }
        return right;
    }

    public static int leftSearch(int[] nums, int target) {
        int right=nums.length-1,left=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                right=mid-1;
            }else if(nums[mid]>target){
                right=mid-1;
            }else if(nums[mid]<target){
                left=mid+1;
            }
        }
            if(left>=nums.length||nums[left]!=target){
                return -1;
            }
            return left;
    }
}



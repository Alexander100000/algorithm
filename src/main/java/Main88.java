/*
* 合并两个有序数组
* */
public class Main88 {
    public static void main(String[] args) {
        int [] nums1={1,2,3,4,5,0,0};
        int [] nums2={1,2};
        int m=5;
        int n=2;
       merge(nums1,5,nums2,n);
    }
//    看到这个题应该能想到双指针，然后迭代条件是nums2里面的元素-1大于等于0（因为nums2里面要是没有元素就不用进行比较所以关键在于nums2）然后跟nums1和nums2里面的元素一一比较（有大于的有小于的遇到大于的这
//    个大于的元素在哪个集合中就把这个中的往后移（因为两个数组都是有序数组，所以在后面的肯定小于前面的））
    public static void merge(int[] nums1, int m, int[] nums2, int n){
        int indexSum=m+n-1;
        int index1=m-1;
        int index2=n-1;
        while(index2>=0){
            if(index1<0){
                nums1[indexSum--]=nums2[index2--];
            }else if(index2<0){
                nums1[indexSum--]=nums1[index1--];
            } else if(nums1[index1]>nums2[index2]){
                 nums1[indexSum--]=nums1[index1--];
            }else {
                nums1[indexSum--]=nums2[index2--];
            }
        }
    }
}

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
* 数组中重复的数字(这个解法可以通过但是时间复杂度和空间复杂度不理想)
*
* */
public class MainOffer03 {
    public static void main(String[] args) {
        int [] nums={2, 3, 1, 0, 2, 5, 3};
        System.out.println(findRepeatNumber(nums));
    }
    public static int  findRepeatNumber(int[] nums){
        if(nums.length==0){
            return 0;
        }
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                return nums[i];
            }
            map.put(nums[i],i);
        }
        return 0;
    }
    public static int  findRepeatNumber1(int[] nums){
        if(nums.length==0){
            return 0;

        }
        int item=0;
        Set<Integer> set=new HashSet<Integer>();
        for(int s:nums){
            if(!set.add(s)){
                item=s;
                break;
            }
        }
        return item;
    }

}

import java.util.HashMap;
/*
* 这个解法的效率非常好,执行时间打败了100%的用户,内存消耗打败了70%的用户
*
* */
public class Main33 {
    public static void main(String[] args) {
//        System.out.println( search(new int[]{4,5,6,7,0,1,2
//        ,0},0));
        System.out.println( search(new int[]{1},1));
    }
    public static int search(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
            if(map.containsKey(target)){
                int b=map.get(target);
                return b;
            }
        }
        return -1;
    }
}

import java.util.HashMap;
/*
* 有序数组求出两数之和（这个解法我是利用我求无序数组的思路来解的时间复杂度虽然不是很高但是排名很拉胯）
* 所以又想了第二种思路
*
* */
public class Main006 {
    public static void main(String[] args) {
         int []nums={1,2,3,4};
         int  target=7;
        System.out.println(twoSum(nums, target));
        System.out.println(twoSum1(nums,target));
    }
    public static int[] twoSum(int[] numbers, int target){
        if(numbers.length==0)return numbers;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            if(map.containsKey(target-numbers[i])){
                int k=map.get(target-numbers[i]);
                if(k>i){
                    return new int[]{i,k};
                }else{
                    return new int[]{k,i};
                }
            }
            map.put(numbers[i],i);
        }
        return null;
    }
//这个解法很易懂，时间复杂度比上面的低
    public static int[] twoSum1(int[] numbers, int target){
        if(numbers.length==0)return numbers;
        int i=0;
        int j=numbers.length-1;
        while(numbers[i]+numbers[j]!=target){
            if(numbers[i]+numbers[j]>target){
                j--;
            }else{
                i++;
            }
        }
        return new int[]{i,j};
    }

}

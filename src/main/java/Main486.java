public class Main486 {
    public static void main(String[] args) {
        System.out.println(PredictTheWinner(new int[]{1,5,2}));
    }
    public static boolean PredictTheWinner(int[] nums) {
        int a=0;
        int b=0;
        for(int i=0;i<=nums.length-1;i++){
            if(a==nums[i]){
               b=nums[nums.length-i];

            }else if(a==nums[nums.length-i]){

            }
        }
      return false;
    }
}

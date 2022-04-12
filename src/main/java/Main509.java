/*
* 斐波那契数列
*
*
* */
public class Main509 {
    public static void main(String[] args) {
        System.out.println(fib(3));
    }
    public static int fib(int n){
//        备忘录
        int []demo=new int[n+1];
        return helper(demo,n);
    }

    private static int helper(int[] demo, int n) {
        //        base case
        if(n==0||n==1)return n;
//       说明已经算过了，不用计算减少不必要的递归
        if(demo[n]!=0)return n;
        demo[n]=helper(demo,n-1)+helper(demo,n-2);
        return demo[n];
    }
}

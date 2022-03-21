/*
* 排列硬币(题目不难，技巧巧妙)
*
*
* */
public class Main441 {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(10));
        System.out.println(arrangeCoinsS(5));
    }
//    第一层要一个一币可以装满，第二层两个，第三层3个（第三层要想填满就必须n-1-2=3）所以可以使用迭代直到填完还剩的硬币数不能满足这个层数就返回
//    这个解法leetcode排名拉胯的狠下面的解法更巧妙
    public static int arrangeCoins(int n){
        for(int i=1;i<=n;i++){
            n=n-i;
            if(n<=i){
                return i;
            }
        }
        return 0;
    }
//   利用一元二次方程的思想找到硬币和层数之间的规律，利用判别式得到二元一次方程的解
    public static int arrangeCoinsS(int n) {
        return (int) ((Math.sqrt((long) 8 * n + 1) - 1) / 2);
    }
}

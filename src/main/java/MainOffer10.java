import java.util.ArrayList;
import java.util.HashMap;

/*
 * 斐波那契数列(F(2)=F(0)+F(1))
 *F(N)=F(N-1)+F(N-2)
 *1.暴力递归(找到二叉树数的叶子节点往上求解)（超出时间限制）
 * */
public class MainOffer10 {
    public static void main(String[] args) {
        System.out.println(fli(10));
        System.out.println(fl(10));
        System.out.println(f(3));
    }

    public static int fli(int n) {
//   第一个第二个元素就是0和1不断往上递归
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fli(n - 1) + fli(n - 2);
    }

    //    因为包暴力递归有很多重复操作所以进行去除递归(时间复杂度O（n）,空间复杂度为O（n）)
    public static int fl(int n) {
//       因为从零开始
        int[] arr = new int[n + 1];
        return recurse(arr, n);
    }

    private static int recurse(int[] arr, int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
//      给递归去重的重要一步操作（n-2在第一次递归中被递归出来了，所以不用进行重复递归可以直接拿return出来的值，
//      因为处理下标为0的节点会为0其他的节点都不可能为0）
        if (arr[n] != 0) return arr[n];
        arr[n] = recurse(arr, n - 1) + recurse(arr, n - 2);
        return arr[n];
    }
//    leetCode原题有些不一样的条件可以去试着用动态规划来解决时间复杂度（时间复杂度O(n),空间复杂度O（1））
    public static int f(int n){
        final int mod=1000000007;
       if(n<2) return n;
       int left=0;
       int mid=0;
       int right=1;
//       left接收n-1的值，mid接收n的值（迭代）
       for(int i=2;i<=n;i++){
         left=mid;
         mid=right;
         right=(left+mid)%mod;
       }
       return right;
    }

    }


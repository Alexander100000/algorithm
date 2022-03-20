/*
 * 因为不能使用自带的apiSqrt().
 * 而且是范围计算（暴力破解我自己尝试的时候超出了预期时间所以选择了二分查找）
 * 这个题的关键点在于咋么去找到合适的二分的点(比如举个简单点的例子,要算的算术平方根的x是10因为你不用从10开始一直遍历，因为5*5也大于10所以先把目标缩短到五然后呢
 * 左右移动左右指针来找到算术平方根)
 * */
public class Main69 {
    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }

    public static int mySqrt(int x) {
        int index = -1;
        int left = 0;
        int right = x;
        while (left <= right) {
//            二分点的查找
            int  mid = left + (right - left) / 2;
//           不强转成long会出现问题（可以自己试一试这个参数去掉long带来的计算不正确）
            if ((long)mid * mid <= x) {
                index = mid;
                left = mid + 1;
            } else {
               right=mid-1;
            }
        }
        return index;
    }
}

/*
 * 求出100的所有素数
 * 素数:可以被自己和1整除，不能被其他的数进行整除，0和1除外的数叫做素数
 * 把这个整数里面的合数给排除掉剩下的都是素数
 * 合数比如12这个数，可以被1整除，也可以被12整除，也可以被3整除等等这个就是合数
 * 利用埃式筛选
 * */
public class Main000 {
    public static void main(String[] args) {
        System.out.println(PrimeNumber(100));
    }

    public static int PrimeNumber(int k) {
//        count为了计数
        int count = 0;
//      创建一个boolean数组默认里面的所有数位素数（false为素数）
        boolean[] nums = new boolean[k];
        //        因为0和1不算素数所以直接略过
        for (int i = 2; i < k; i++) {
            if (!nums[i]) {
                count++;
            }
//            精髓在这里看不懂可以debug来看
            for (int j = 2 * i; j < k; j += i) {
                nums[j] = true;
            }

        }

        return count;
    }
}

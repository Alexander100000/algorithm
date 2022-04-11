/*
* 贪心算法局部最优(收20块的时候会有两种方案，一个是可以10+5，另一个是3个5)
*
*
* */
public class Main860 {
    public static void main(String[] args) {
        System.out.println(lemonadeChange(new int[]{5, 5, 5, 10, 20}));
    }

    public static boolean lemonadeChange(int[] bills) {
        if (bills.length == 0) {
            return false;
        }
        int money = 0;
        int b = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                money++;
            } else if (bills[i] == 10) {
                if (money < 0) {
                    return false;
                }
                b++;
                money--;
            } else {
                if (money > 0 && b > 0) {
                    money--;
                    b--;
                } else if (money >= 3) {
                    money -= 3;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}

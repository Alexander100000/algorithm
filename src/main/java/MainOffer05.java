/*
* 这个题使用这个api可以轻松解决(时间复杂度很优秀)
*
*
* */
public class MainOffer05 {
    public static void main(String[] args) {
        System.out.println(replaceSpace("We are happy."));
    }
    public static String replaceSpace(String s) {
        return s.replace(" ","%20");
    }
}

import java.util.HashMap;
/*
*
* 双指针的做法
*
* */
public class Main392 {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc","ahbgdc"));
    }
    public static boolean isSubsequence(String s, String t){
        int j=0,i=0;
        while(s.length()>j&&t.length()>i){
            if(s.charAt(j)==t.charAt(i)){
                j++;
            }
            i++;
        }
        return j==s.length();
    }

}

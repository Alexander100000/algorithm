public class Main172 {
    public static void main(String[] args) {
        System.out.println(trailingZeroes(2));
    }
    public static int trailingZeroes(int n){
        int res=0;
        long des=5;
        while(des<=n){
//
            res+=n/des;
            des*=5;
        }
        return res;
    }
}

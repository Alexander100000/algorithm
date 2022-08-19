/*
* 懒汉式设计模式
* 饿汉式设计模式
*
*
* */
public class Main0009 {
    private static volatile Main0009 instance;
    /*
    * 构造函数私有化
    *
    * */
    private Main0009(){

    }
    /*
    * 对外的方法
    *
    * */

    public void process(){
        System.out.println("调用成功");
    }

//    public static Main0009 getInstance() {
//        if(instance==null){
//            instance=new Main0009();
//        }
//        return instance;
//    }
//}
/*
 * 对外暴露一个获取类的对象
 *通过加锁synchronized 保证单列
 *
 * */
//    public static synchronized Main0009 getInstance() {
//        if(instance==null){
//            instance=new Main0009();
//        }
//        return instance;
//    }
    /*
    * 双重检查锁定
    *
    * 这种也不是最安全的，instance = new Main0009()这个不是原子性操作
    * */
    public static Main0009 getInstance(){
        if(instance==null) {
            synchronized (Main0009.class) {
                if(instance==null){
                    instance = new Main0009();
                }
            }
        }
        return instance;
    }
}
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
/*
* 型号量可以做为多个线程强多个资源也可以作为多个线程强一个资源（还可以指定公平和非公平锁）经典解决生产者和消费者模型的
*
* */
public class Main0001 {
    public static void main(String[] args) {
//        模拟2个停车位
        Semaphore semaphore=new Semaphore(2);
//        有4部车
        for(int i=0;i<4;i++){
               new Thread(()->{
                   try {
//                       执行这个方法说明抢到车位(这两个api方法一定要记住)
                       semaphore.acquire();
                       System.out.println(Thread.currentThread().getName()+"抢到车位了");
                       try {
//                           模拟在停车场停车三秒后离开
                           TimeUnit.SECONDS.sleep(3);
                           System.out.println(Thread.currentThread().getName()+"停车完成以后离开");
                       }catch (InterruptedException e){
                           e.printStackTrace();
                       }
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }finally {
//                      停车完成以后可以让把已站的停车位释放掉 （已站车位减一，空余车位加一）&&（这个api方法也要记住）
                       semaphore.release();
                   }
               },String.valueOf(i)).start();
        }
    }
}

import java.util.concurrent.CountDownLatch;
/*
* CountDownLatch 又是熟悉的生产者和消费者模型给定缓冲区为7然后让生产者生产消息一个一个投递缓存区的容量一个一个的做减法(原子递减)，一直到为zero然后
* 才会调用countDownLatch的await方法然后通知消费者消费者消费完然后阻塞通知生产者。
 *
*
* */
public class Main0003 {
    private static final int STUDENTS =7;
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch=new CountDownLatch(STUDENTS);
        for(int i=0;i<7;i++){
            new Thread(()->{System.out.println(Thread.currentThread().getName()+"开完会离开，会议室");
//            进行--操作（原子递减）
                countDownLatch.countDown();
            },String.valueOf(i)).start();

        }
        countDownLatch.await();
        System.out.println(Thread.currentThread().getName()+"会议组织负责人关门，关门");
    }

}

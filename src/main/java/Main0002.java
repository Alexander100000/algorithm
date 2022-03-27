import java.util.concurrent.CyclicBarrier;
/*
*
* CyclicBarrier 是达到某个标准以后才会去执行比如说生产者在一次最多生产两个消息，使用CyclicBarrier来解决这个问题，他会在生产者生产完两个
* 消息以后就会阻塞生产者，通知消费者然后消费者消费完所有的消息以后在阻塞然后通知生产者。
*
* */
public class Main0002 {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier=new CyclicBarrier(7,()->{
            System.out.println("开始开会"); });
        for(int i=0;i<7;i++){
             int item=i;
            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+"会议室来了第"+item+"个人");
                try {
//                  早来的人要先等待，等到7个人全部到齐才能开会
                    cyclicBarrier.await();
                }catch (Exception e){
                    e.printStackTrace();
                }
            },String.valueOf(i)).start();
        }
    }
}

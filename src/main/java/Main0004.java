import java.util.concurrent.*;

public class Main0004 {

    public static void main(String[] args) {
/*
* 手动创建一个线程池有7大参数一下会一一说明
* 1.corePoolSize:核心线程数（可以理解成一个商场有5个按摩机器，但是为了节省成本这个按摩机器的主人会一直开启2个按摩机器，
* 剩下的按摩机器只会在客户量很大的时候才会去开启，这里一直开启的按摩机器可以看成核心线程数）
* 2.maximumPoolSize:最大线程数（这个就是商场中的按摩机器的总数所以这里一共有五个）
* 3.keepAliveTime:最大的保持时间（就是5个按摩椅同时工作，工作完成过几个时间单位后被收回释放（在规定的时间内没有人想用这个按摩椅所以老板选择关闭））
*4.TimeUnit最大保持时间的单位
* 5.阻塞队列（也就是这个两个一直运行的按摩机器被人占了，其他客户也想按摩所以选择等待，按摩椅的主人会预料到会出现这种情况就准备了一个有三个作为的空间意思是3
* 个人可以在那里等待，这个3个人的空间称为阻塞队列
* 6.线程工厂
* 7.拒绝策略:就是当两个按摩椅和3个等待空间都满了老板会开启剩下的三个按摩椅，然后在开启最大数的按摩椅的情况下以及等待区也满了的情况下还有人过来想要使用
* 按摩椅所以这个时候会触发线程池的拒绝策略
*线程池存在四种拒绝策略:1.AbortPolicy:直接丢弃任务，抛出异常，这是默认策略(就是全满的情况下还来了人这个时候会提示所有地方都满了让他明天来)
*
* 2.CallerRunsPolicy:只用调用者所在的线程来处理任务（这个时候是由main线程来解决这个任务）
* 3.DiscardPolicy:已超过最大承载量（最大承载量下面已介绍）就会丢弃任务但是不会抛出异常（被请出去，但是不会给他说明天来呀这种话）
* 4.DiscardOldestPolicy:丢弃等待队列中最老的任务，然后执行这个新的任务（列子不恰当在这里，意思就是等待区等的越久的人被新来的人插队然后老板把那个等的越久的人给
* 赶出去了）
* */
        ExecutorService threadPool=new ThreadPoolExecutor(2,
                5,
                3,
                TimeUnit.SECONDS,
               new LinkedBlockingQueue<>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.DiscardOldestPolicy());
        try{
//            最大的承载:最大线程数+等待队列的大小
//            大于8以上就会触发拒绝策略
            for(int i=0;i<9;i++){
                threadPool.execute(()->{
                    System.out.println(Thread.currentThread().getName()+"来了老弟");
                });
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
//           线程池用完，程序结束，关闭线程池
            threadPool.isShutdown();
        }
    }

}

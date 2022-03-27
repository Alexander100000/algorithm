import java.util.LinkedList;
import java.util.Queue;


/*
 * 生存者和消费者模型
 *
 * */
public class Main0000 {
    public static void main(String[] args) {
        Buffer buffer=new Buffer();
        Producer producer=new Producer(buffer);
        Consumer consumer=new Consumer(buffer);
        producer.start();
        consumer.start();
    }
}

//生产者
class Producer extends Thread {
    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
//                 把生产者生产的放入到缓存区
                buffer.add(i);
                Thread.sleep((int) Math.random() * 100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
//消费者
class Consumer extends Thread {
    private Buffer buffer;
    public Consumer(Buffer buffer){
        this.buffer=buffer;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
               int val=buffer.poll();
                System.out.println(val);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

            }

        }



//缓冲区
/*
 * 1.当生产者生产数据的时候缓存区不能为满不然会抛异常
 * 2.当消费者消费数据的时候缓存区不能为空不然会抛异常
 *
 * */
class Buffer {
    private Queue<Integer> queue = new LinkedList<>();
    private int size = 5;

    //    因为在多线程情况下要进行加锁
    public synchronized void add(int val) throws InterruptedException {
//        因为缓存区的容量已满所以进行阻塞生产者不让其生产
        if (queue.size() > size) wait();
        queue.add(val);
//        通知消费者去消费
        notify();
    }

    public synchronized int poll() throws InterruptedException {
//        缓存区为空
        if (queue.size() == 0)
//            阻塞消费者，不让其消费
            wait();
//        消费者拿到生产者的消息
            int val = queue.poll();
//           通着生产者去生产消费
            notify();
            return val;

    }
}
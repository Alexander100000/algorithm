import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class Main0008 {
   private static AtomicInteger atomicInteger=new AtomicInteger(0);
    public static void main(String[] args) {
     boolean result=atomicInteger.compareAndSet(0,1);
     boolean result1=atomicInteger.compareAndSet(0,1);
        System.out.println(result);
        System.out.println(result1);
        ReentrantLock reentrantLock=new ReentrantLock();
        reentrantLock.lock();
        reentrantLock.unlock();
    }
}

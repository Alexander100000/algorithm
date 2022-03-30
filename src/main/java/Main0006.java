/*
* 创建线程的第二种方法实现Runnable接口
*
* */
public class Main0006 implements Runnable{
    @Override
    public void run() {
        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"hello");
        },"hi").start();
    }

    public static void main(String[] args) {
        Main0006 main0006=new Main0006();
        main0006.run();
        System.out.println(Thread.currentThread().getName());
    }
}

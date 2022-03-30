/*
* 创建线程的方法注意继承thread类
*
* */
public class Main0005 extends Thread{
    public static void main(String[] args) {
        Main0005 main0005=new Main0005();
        main0005.setName("007");
        main0005.start();
        System.out.println(Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"1");
    }
}

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/*
* 通过callable和futureTask(有返回值)
*
* */
public class Main0007 implements Callable<Object> {
    @Override
    public Object call() throws Exception {
        System.out.println(Thread.currentThread().getName()+"你说:");
//        这是返回值
        return "你好";
    }

    public static void main(String[] args) {
        Main0007 main0007=new Main0007();
        FutureTask<Object>futureTask=new FutureTask<>(main0007);
        Thread thread=new Thread(futureTask);
        thread.setName("大屁");
        thread.start();
        try {
//          拿到返回值
            System.out.println(futureTask.get());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

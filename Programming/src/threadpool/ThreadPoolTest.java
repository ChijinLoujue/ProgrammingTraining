package threadpool;

import java.util.SplittableRandom;
import java.util.concurrent.*;

public class ThreadPoolTest {
    public static void main(String []args){
        ThreadPoolExecutor exs = new ThreadPoolExecutor(5,10, 200, TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<>(5));
//        Executors.newCachedThreadPool();
//        ExecutorService exs = Executors.newCachedThreadPool();
        for(int i = 0;i<15;++i){
            MyTask myTask = new MyTask(i);
            exs.execute(myTask);
            System.out.println("the count of threads in thread poor:"+exs.getPoolSize()+",the count of tesk waiting in queue:"+
                    exs.getQueue().size()+"the count of tesk what was ex over:"+exs.getCompletedTaskCount());
        }
        exs.shutdown();
    }
}

class MyTask implements  Runnable{
    private int taskNum;
    public MyTask(int num){
        this.taskNum = num;
    }

    @Override
    public void run(){
        System.out.println("正在执行task"+taskNum);
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("task"+taskNum+"over");
    }
}


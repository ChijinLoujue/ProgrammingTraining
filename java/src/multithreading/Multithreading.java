package multithreading;

public class Multithreading implements Runnable{
    private String name;
    public Multithreading(String name){
        this.name = name;
    }
    private static int total = 20;

    public void run(){
      System.out.println(Thread.currentThread().getName());
        for(int i = 0;i<10;++i){
            System.out.println(name+":"+i);
            synchronized (new Object()){
                if(total>0){
                    total--;
                }
                System.out.println(name+":"+total);
            }
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

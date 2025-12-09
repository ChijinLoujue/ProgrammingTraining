package multithreading;

public class MainClass {
    public static void main(String []args){

        Multithreading mul1 = new Multithreading("mul1");
        Multithreading mul2 = new Multithreading("mul2222222");
        Thread thread1 = new Thread(mul1);
        Thread thread2 = new Thread(mul2);
        thread1.start();
        thread2.start();
    }
}

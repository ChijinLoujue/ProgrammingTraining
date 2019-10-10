package multithreading;

public class MainClass {
    public static void main(String []args){
        Multithreading mu1 = new Multithreading("a1");
        Multithreading mu2 = new Multithreading("a2");
        Multithreading mu3 = new Multithreading("a3");

        mu1.start();
        mu2.start();
        mu3.start();
    }
}

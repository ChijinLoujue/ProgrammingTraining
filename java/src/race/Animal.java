package race;

public abstract class Animal extends Thread {
    public int length = 100;
    public abstract void running();
    @Override
    public void run(){
        super.run();
        while (length>0){
            running();
        }
    }

    public interface Calltoback{
        void win();
    }
    public Calltoback calltoback;
}

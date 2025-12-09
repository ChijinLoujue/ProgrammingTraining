package codinginterviews;

public class Question2 {
    private static class SingletonHolder{
        static final Question2 instance = new Question2();
    }
    public static Question2 getInstance(){
        return SingletonHolder.instance;
    }
}

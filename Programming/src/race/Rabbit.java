package race;

public class Rabbit extends Animal {
    public Rabbit(){

    }
    @Override
    public void running(){
        int dis = 5;
        length -= dis;

        System.out.println("LazyRabbit ran "+dis+" meters, "+length+" meters from the finish line");
        if(length<=0){
            length = 0;
            System.out.println("LazyRabbit win!");
            if(calltoback!=null){
                calltoback.win();
            }
        }
        try{
            if((2000-length)%20 ==0){
                sleep(1000);
            }else sleep(100);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }


}

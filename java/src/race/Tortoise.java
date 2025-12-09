package race;

public class Tortoise extends Animal {
    public Tortoise(){
        setName("Tortoise");
    }
    @Override
    public void running(){
        int dis = 2;
        length -= dis;
        System.out.println("Tortoise ran "+dis+" meters, "+length+" meters from the finish line");
        if(length<=0){
            length = 0;
            System.out.println("Tortoise win");
            if(calltoback!=null){
                calltoback.win();
            }
        }
        try{
            sleep(100);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

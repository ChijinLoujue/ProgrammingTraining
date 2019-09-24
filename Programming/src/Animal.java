abstract class Animal {
    abstract void eat();
}
class Cat extends Animal{
    public void eat(){
        System.out.println("eating fish.");
    }
    public void work(){
        System.out.println("catch mouse,");
    }

}
class Dog extends Animal{
    public void eat(){
        System.out.println("eating meat.");
    }
    public void work(){
        System.out.println("look after the house.");
    }

}

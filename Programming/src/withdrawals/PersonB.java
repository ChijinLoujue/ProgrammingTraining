package withdrawals;

public class PersonB extends Thread {
    Bank bank;
    String mode;
    String name;
    public PersonB(Bank bank,String mode,String name){
        this.mode = mode;
        this.bank = bank;
        this.name = name;
    }
    public void run(){
        while(bank.money>=200){
            try{
                bank.outMoney(200,mode,name);
            }catch (Exception e1){
                e1.printStackTrace();
            }
            try {
                sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

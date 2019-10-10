package withdrawals;

import java.util.Objects;

public class Bank {
    static double money =1000;

    private void counter(double money,String name){
        Bank.money -= money;
        System.out.println(name+"柜台取钱"+money+"元，还剩"+Bank.money+"元");
    }

    private void ATM(double money,String name){
        Bank.money -= money;
        System.out.println(name+"ATM取钱"+money+"元，还剩"+Bank.money+"元");
    }

    public synchronized void outMoney(double money,String mode,String name)throws Exception{
        if(money>Bank.money){
            throw new Exception(name+"取款金额"+money+",余额只剩"+Bank.money+"，取款失败");
        }
        if (Objects.equals(mode,"ATM")){
            ATM(money,name);
        }else{
            counter(money,name);
        }
    }
}


//public class Main{
//    public static void main(String[] args){
//        withdrawals.Bank bank = new withdrawals.Bank();
//
//        withdrawals.PersonA a = new withdrawals.PersonA(bank,"Counter");
//        withdrawals.PersonB b = new withdrawals.PersonB(bank,"ATM");
//
//        a.start();
//        b.start();
//    }
//
//
//}
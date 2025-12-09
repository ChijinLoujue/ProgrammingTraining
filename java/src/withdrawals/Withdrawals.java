package withdrawals;

public class Withdrawals {
        public static void main(String[] args){
        Bank bank = new Bank();

        PersonA a = new PersonA(bank,"Counter","a");
        //PersonB b = new PersonB(bank,"ATM");
        PersonA a1 = new PersonA(bank,"Counter","a1");
        a.start();
        a1.start();
    }
}

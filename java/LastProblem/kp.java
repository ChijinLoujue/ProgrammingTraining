import java.util.Scanner;
public class kp{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        while(myScanner.hasNext()){
            String inputS=myScanner.nextLine();
            int input = Integer.parseInt(inputS);
            if(input!=0)
                System.out.println(doSomething(input));
        }
    }
    public static int doSomething(int input){
        int output=0,i=0;
        while(input>3){
            output=output+input/3;
            input=output+input%3;
        }
        return output;
    }
}
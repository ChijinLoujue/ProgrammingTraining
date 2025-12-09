import java.util.Scanner;

public class FibonacciSequence {
    public static void mainf(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int m = sc.nextInt();

            long fibN1 = 1;
            long fibN2 = 1;
            long fibN = 0;
            if (m < 2){
                if(m==0)
                    System.out.println(1);
                if(m==1)
                    System.out.println(1);
            }
            else {
                for (int i = 2; i <= m; i++) {
                    fibN = fibN1 + fibN2;
                    fibN2 = fibN1;
                    fibN1 = fibN;
                }
                System.out.println(fibN);
            }
        }
    }



}

package codinginterviews;

import java.util.Scanner;

public class Question16 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        int exponent = sc.nextInt();
        System.out.println(Power(base,exponent));
    }
    public static double Power(double base, int exponent) {
        if (base < 1.0e-14 && base > -1.0e-14)
            return 0;
        if (exponent == 0)
            return 1;
        double result = 1;
        if (exponent > 0) {
            for (int i = 0; i < exponent; ++i) {
                result *= base;
            }
        } else {
            for (int i = 0; i < -exponent; ++i) {
                result /= base;
            }
        }
        return result;
    }
}

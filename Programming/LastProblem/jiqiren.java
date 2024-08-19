import java.util.Scanner;
import java.math.*;
public class jiqiren {

    public static double dosomething(int a){
        double k =0.0;
        if(a<=2)
        {
            k = a+1;
            return k;
        }
        else{
            for(int i=1;i<a-1;i++)
                k=(a-i+1)*Math.pow(2, i)+k;
            k=k+a+3;
            k = k/8;
            return k;
        }

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();
            System.out.println(dosomething(a));
        }
    }
  
}
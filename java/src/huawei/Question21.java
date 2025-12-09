package huawei;
//相同数量苹果必为偶数
import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = 0;
        for(int i = 0; i < n; i++){
            temp ^= sc.nextInt();
        }
        System.out.println(temp);
    }
}

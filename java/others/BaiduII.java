import java.util.Scanner;

public class BaiduII {
    public static void mainb(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(dosomething(n,m));
    }
    public static int dosomething(int n,int m){
        if(((n+m)%2!=0)||(n<=m)){
            return 1;
        }
        int duo = (n+m)/2;
        int shao = duo-m;
        return dosomething(duo,m)+dosomething(shao,m);
    }

}

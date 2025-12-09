package neteasegame;
//网易互娱0928 No.1 乘法中列竖式计算数字出现的次数
import java.util.Scanner;

public class ColumnMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []all = new int[]{0,0,0,0,0,0,0,0,0};
        for(int i = 0; i < n; i++){
            int []there = new int[]{0,0,0,0,0,0,0,0,0};
            int a = sc.nextInt();
            int b = sc.nextInt();
            int [] bg =qiuheweishi(b);
            int lenb = bg.length;
            for(int j = 0;j<lenb;++j){
                int [] kk = qiuheweishi(bg[j]*a);
                for(int k = 0;k<kk.length;++k){
                    if(kk[k]>0)
                    there[kk[k]-1]++;
                }
            }
            int [] ab = qiuheweishi(b*a);
            for(int k = 0;k<ab.length;++k) {
                if(ab[k]>0)
                    there[ab[k]-1]++;
            }
            int [] aa = qiuheweishi(a);
            for(int k = 0;k<aa.length;++k) {
                if(aa[k]>0)
                    there[aa[k]-1]++;
            }
            int [] bb = qiuheweishi(b);
            for(int k = 0;k<bb.length;++k) {
                if(bb[k]>0)
                    there[bb[k]-1]++;
            }
            for(int lll = 0;lll<there.length;++lll) {
                System.out.print(there[lll]+" ");
            }
            System.out.println();
            for(int z = 0;z<9;++z){
                all[z] += there[z];
            }
        }
        System.out.println(maxarray(all));
    }
    public static int[] qiuheweishi(int num){
        String numS = String.valueOf(num);
        char[] numC = numS.toCharArray();
        int numlen = numC.length;
        int [] numi = new int [numlen];
        for (int i =0;i<numlen;++i){
            numi[i] = numC[i]-'0';
        }
        return numi;
    }

    public static int maxarray(int[] num){
        int max = num[0];
        int indexmax =0;
        for(int i = 0;i<num.length;++i){
            if(num[i]>max){
                max = num[i];
                indexmax =i;
            }
        }
        return indexmax+1;
    }
}

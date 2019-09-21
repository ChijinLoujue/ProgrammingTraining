//字节跳动：2018
//[编程题] 编程题1
//时间限制：1秒
//空间限制：32768K
//P为给定的二维平面整数点集。定义 P 中某点x，如果x满足 P 中任意点都不在 x 的右上方区域内（横纵坐标都大于x），
//则称其为“最大的”。求出所有“最大的”点的集合。（所有点的横坐标和纵坐标都不重复, 坐标轴范围在[0, 1e9) 内）
//如下图：实心点为满足条件的点的集合。请实现代码找到集合 P 中的所有 ”最大“ 点的集合并输出。
//
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String inputFirstStr = myScanner.nextLine();
        int N = Integer.parseInt(inputFirstStr);
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

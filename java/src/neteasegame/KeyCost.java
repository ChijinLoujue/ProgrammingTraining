package neteasegame;
//网易互娱0928 No.2 6个按键切换的最小代价
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KeyCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.nextLine();
        for(int i = 0;i<x;++i){
            String line = sc.nextLine();
            char[] charSet = line.toCharArray();
            int[] inSet = new int[6];
            int minDis = 0x7FFFFFFF;
            for(inSet[0] =1;inSet[0]<=6;inSet[0]++){
                for(inSet[1] =1;inSet[1]<=6;inSet[1]++){
                    if(inSet[1]==inSet[0]) continue;
                    for(inSet[2] =1;inSet[2]<=6;inSet[2]++){
                        if(inSet[2]==inSet[0]||inSet[2]==inSet[1]) continue;
                        for(inSet[3] =1;inSet[3]<=6;inSet[3]++){
                            if(inSet[3]==inSet[0]||inSet[3]==inSet[2]||inSet[3]==inSet[1]) continue;
                            for(inSet[4] =1;inSet[4]<=6;inSet[4]++){
                                if(inSet[4]==inSet[0]||inSet[4]==inSet[3]||inSet[4]==inSet[2]||inSet[4]==inSet[1]) continue;
                                for(inSet[5] =1;inSet[5]<=6;inSet[5]++){
                                    if(inSet[5]==inSet[0]||inSet[5]==inSet[4]||inSet[5]==inSet[3]||inSet[5]==inSet[2]||inSet[5]==inSet[1]) continue;
                                    int totalDis = daijia(charSet,inSet);
                                    if(totalDis<minDis) minDis = totalDis;
                                }
                            }
                        }
                    }
                }
            }
            System.out.println(minDis);
        }

    }

    public static int daijia(char[] charSet,int[] inSet){
        Map<Character,Integer> ciMap = newMap(inSet);

        int totalDis =0;
        int position =1;
        for(char i:charSet){
            int postPos = ciMap.get(i);
            totalDis += absDis(position,postPos);
            position =postPos;
        }
        return totalDis;
    }

    public static Map<Character,Integer> newMap(int[] inSet){
        Map<Character,Integer> ciMap = new HashMap<>();
        ciMap.put('A',inSet[0]);
        ciMap.put('S',inSet[1]);
        ciMap.put('D',inSet[2]);
        ciMap.put('F',inSet[3]);
        ciMap.put('G',inSet[4]);
        ciMap.put('H',inSet[5]);
        return ciMap;
    }

    public static int absDis(int a,int b){
        if(a>b){
            return a-b;
        }else {
            return b-a;
        }
    }

}

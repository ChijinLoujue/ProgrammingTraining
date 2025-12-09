
//huawie3
import java.util.*;
import java.math.*;
public class huawei3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String Ox = in.nextLine();
            int n = Ox.length();
            int num = 0, All = 0;
            for(int i = n-1;i>1;i--){

                switch (Ox.charAt(i)) {
                    case '0': 
                        num = 0;
                        break;
                    case '1':  
                        num = 1;
                        break;
                    case '2':  
                        num = 2;
                        break;
                    case '3': 
                        num = 3;
                        break;
                    case '4': 
                        num = 4;
                        break;
                    case '5': 
                        num = 5;
                        break;
                    case '6': 
                        num = 6;
                        break;
                    case '7': 
                        num = 7;
                        break;
                    case '8': 
                        num = 8;
                        break;
                    case '9': 
                        num = 9;
                        break;
                    case 'A': 
                        num = 10;
                        break;
                    case 'B': 
                        num = 11;
                        break;
                    case 'C': 
                        num = 12;
                        break;
                    case 'D': 
                        num = 13;
                        break;
                    case 'E': 
                        num = 14;
                        break;
                    case 'F': 
                        num = 15;
                        break;
                    default:
                        break;
                }
                All = All+num*(int)(Math.pow(16, n-1-i));
            }
            System.out.println(All);
        }

    }
}
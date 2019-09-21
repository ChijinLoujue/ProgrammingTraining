import java.util.Scanner;

//import com.sun.org.glassfish.gmbal.Impact;

//import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            String input = in.nextLine();
            System.out.println(dosomething(input));
        }
        
        
    }
    public static String dosomething(String input){
        if(!input.contains("|")){
            return input;
        }
        boolean isStart=false;
        boolean isCount=false;
        int zCount =-1;
        StringBuilder zipStr = new StringBuilder();
        int strlen = input.length();
        for(int i = strlen-1;i>=0;i--){
            char input_char = input.charAt(i);
            if(input_char==']'){
                isStart=true;
                continue;
            }
            if(input_char=='|'){
                isCount=true;
                continue;
            }
            if(!isStart&&!isCount){
                continue;
            }
            else if(isStart&&!isCount){
                zipStr.insert(0, input_char);
            }
            else if(isStart&&isCount){
                char[] val = new char[]{input_char};
                zCount = Integer.valueOf(new String(val));
                break;
            }
        }
        String oldStr = "["+zCount+"|"+zipStr.toString()+"]";
       
        
        StringBuilder result = new StringBuilder();
        String zipS = zipStr.toString();
        for(int j=0;j<zCount;j++){
            result =result.append(zipS);
        }
        input = input.replace(oldStr, result.toString());
        return !input.contains("|")? input:dosomething(input);
    }
}
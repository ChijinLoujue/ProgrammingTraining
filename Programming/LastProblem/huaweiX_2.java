import java.util.*;
import java.util.ArrayList;
import java.lang.Number;
//import com.sun.org.apache.xpath.internal.operations.String;

public class huaweiX_2 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] namelist = new String[10];
        int []  linelist = new int[10];
        int[] errotimes = new int[10];
        int erronum=0;
        while(in.hasNext()){
            String  Filename = in.next();
            int line =in.nextInt();
            int len = Filename.length();
            int slash=len-1;
            for(;slash>=0;slash--){
                if(Filename.charAt(slash)=='\\'){
                    slash++;
                    break;
                }
            }

            String realFilename=Filename.substring(slash, len);
            boolean iscommen=false;
            if(erronum!=0){
                for(int i=0;i<erronum;i++){
                    if(realFilename.equalsIgnoreCase(namelist[erronum])&&(linelist[erronum]==line)){
                        errotimes[i]++;
                        iscommen=true;
                        break;
                    }
                }
            }
            if(!iscommen){
                namelist[erronum]=realFilename;
                linelist[erronum]=line;
                errotimes[erronum]=1;
            }

            erronum++;
        }
        for(int i=0;i<erronum-1;i++){
            for(int j=0;i<erronum-1-i;j++){
                if(errotimes[j]>errotimes[j+1]){
                    int temp=errotimes[j];
                    errotimes[j]=errotimes[j+1];
                    errotimes[j+1]=temp;

                    String tstr=namelist[j];
                    namelist[j]=namelist[j+1];
                    namelist[j+1]=tstr;

                    int tline = linelist[j];
                    linelist[j]=linelist[j+1];
                    linelist[j+1] = tline;

                }
            }
        }
        int times =erronum;
        if(times>8) times=8;
        for(int i=0;i<times;i++){

            String thisname=namelist[erronum-1-i];
            int thisline =linelist[erronum-1-i];
            int thiserrotimes = errotimes[erronum-1-i];
            if(thisname.length()>16){
                thisname=thisname.substring(thisname.length()-16,thisname.length()-1);
            }
            System.out.println(thisname+" "+thisline+" "+thiserrotimes);
        }
        in.close();
    }
}









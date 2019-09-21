import java.util.*;

public class huawei16_3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int[][] input = new int[9][9];
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    input[i][j]= in.nextInt();
                }
            }
            int [] All = {0,0,0,0,0,0,0,0,0,0};
            int zeronum =1;
            int times = 0;
            while((zeronum!=0)&&(times!=81)){
                times++;
                zeronum=0;
                for(int i=0;i<9;i++){
                    for(int j=0;j<9;j++){
                        if(input[i][j]==0){
                            zeronum=zeronum+1;
                            for(int k=0;k<9;k++){
                                All[input[i][k]]=1;
                                All[input[k][j]]=1;
                                All[input[(i/3)*3+k/3][(j/3)*3+k%3]]=1;
                            }
                            //All[0]=1;
                            int he = 0;
                            for(int k=0;k<10;k++){
                                he =he+All[k];
                            }
                            if(he==9){
                                for(int k=1;k<10;k++){
                                    if(All[k]==0)
                                    input[i][j]=k;
                                }
                            }




                        }

                    }
                }
            }
            for(int i=0;i<9;i++){
                String result ="";
                for(int j=0;j<9;j++){
                    result = result+String.valueOf(input[i][j])+" ";
                }
                System.out.println(result);
            }
        }
        in.close();
    }

}

package codinginterviews;

import java.util.HashMap;
import java.util.Iterator;

public class Question56 {


    public void FindNumsAppearOnce1(int [] array,int num1[] , int num2[]) {
        HashMap<Integer,Integer> map = new  HashMap<Integer,Integer>();
        int len = array.length;
        for(int i = 0; i<len;++i){
            if(!map.containsKey(array[i]))
                map.put(array[i],0);
            else map.put(array[i],1);
        }
        boolean is2 = false;
        for(int i = 0; i<len;++i){
            if(map.get(array[i])==0&&(!is2)){
                num1[0] = array[i];
                is2 = true;
            }
            if(map.get(array[i])==0&&is2){
                num2[0] = array[i];
            }

        }


    }
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {



    }


}

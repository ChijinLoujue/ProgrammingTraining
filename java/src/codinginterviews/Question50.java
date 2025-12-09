package codinginterviews;

import java.util.HashMap;

public class Question50 {
    public int FirstNotRepeatingChar(String str) {
        if(str==null)
        return 0;
        int len = str.length();
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i =0;i<len;++i){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }else {
                map.put(str.charAt(i),1);
            }
        }
        int index = -1;
        for(int i =0;i<len;++i){
            if(map.get(str.charAt(i))==1){
                index =i;
                break;
            }
        }
        return index;
    }
}

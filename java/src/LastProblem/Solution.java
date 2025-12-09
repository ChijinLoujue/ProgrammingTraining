public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int common=s.length();
        for(int len=s.length();len>1;len--) {
            for(int begin=0;begin+len<=s.length();begin++){
                String srr=s.substring(begin, begin+len-1);
                for(int i=0;i<srr.length()-1;i++){
                    boolean co=false;
                    for(int j = i+1; j < srr.length(); j++){
                        if(srr.charAt(i) == srr.charAt(j)){
                            co=true;
                            break;
                        }
                    }
                    if(co=false) common=srr.length();
                }
            }
        }
        return common;
    }
}


class Solution {
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



//class Solution {
//    public int lengthOfLongestSubstring(String s) {
//        char ch;
//        int common = 0;
//        for(int i=0;i<s.length()-2;i++) {
//            int common1=0;
//            for (int j = i+1; j < s.length()-1; j++) {
//                common1=j-i;
//                if(s.charAt(i) == s.charAt(j))
//                    break;
//            }
//            if(common1>common)
//                common=common1;
//
//        }
//        return common;
//    }
//}

package huawei;

import java.util.ArrayList;
import java.util.Scanner;

public class Question3 {
    public static void question3(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<String>> strList= new ArrayList<ArrayList<String>>();
        while (sc.hasNext()){
            String currStr = sc.nextLine();
            String []currStrArr = currStr.split(" | ");
            ArrayList<String> currStrList = new ArrayList<String>();
            for(int i = 0;i<currStrArr.length;++i){
                currStrList.add(currStrArr[i]);
            }
            strList.add(currStrList);
        }

    }
//    public static ArrayList<ArrayList<String>> zhengli(ArrayList<ArrayList<String>> strList){
//
//
//    }
}
/***
 2018-10-25 09:41:57,744 | INFO  | qtp1264453072-324 | AcAnVxlanRestconf | postVniConfigs   | 242 | [ENTER] ne id 53daea1f-51f0-4c35-973b-7f2165ea0055, vni id 1.
 2018-10-25 09:41:57,745 | INFO  | qtp1264453072-324 | NeCheckUtil       | checkNeIsExisted | 159 | [ENTER] ne id is 53daea1f-51f0-4c35-973b-7f2165ea0055.
 2018-10-25 09:41:57,746 | INFO  | qtp1264453072-324 | NeCheckUtil       | checkNeIsExisted | 265 | ne 53daea1f-51f0-4c35-973b-7f2165ea0055 is online.
 2018-10-25 09:41:57,767 | INFO  | qtp1264453072-324 | NeCheckUtil       | checkNeIsExisted | 265 | [EXIT] ne 53daea1f-51f0-4c35-973b-7f2165ea0055 is existed.
 2018-10-25 09:41:57,780 | INFO  | qtp1264453072-324 | AcAnVxlanRestconf | createInstance   | 280 | [ENTER] create vni 1.
 2018-10-25 09:41:58,092 | INFO  | qtp1264453072-324 | AcAnVxlanRestconf | createInstance   | 320 | [EXIT] create vni 1 success.
 2018-10-25 09:41:58,093 | INFO  | qtp1264453072-324 | AcAnVxlanRestconf | postVniConfigs   | 260 | [EXIT] ne 53daea1f-51f0-4c35-973b-7f2165ea0055 vni id 1 create success.
 */

package maptrain;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String []args){
        Map <String,Integer> m1= new HashMap();
        m1.put("z0",0);
        m1.put("z1",1);
        m1.put("z2",2);
        m1.put("z3",3);
        m1.put("z4",4);
        m1.put("z5",5);
        m1.remove("z5");

        try{
            System.out.println(m1);
            System.out.println(m1.size());
            System.out.println(m1.hashCode());
            System.out.println(m1.entrySet());
            System.out.println(m1);
            System.out.println(m1.containsKey("z1"));
            System.out.println(m1.containsValue("z1"));
            System.out.println(m1.keySet());
            Integer x = m1.get("z6");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

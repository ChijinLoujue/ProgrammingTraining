package listtrain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkListTest {
    public static void main(String []args){
        LinkedList<String> list1 = new LinkedList<String>();
        list1.add("first");
        list1.add("2");
        list1.add("3");
        list1.add("1");
        list1.add("2");
        list1.add("end");
        for(String str:list1){
            System.out.print(str+" ");
            System.out.println();
        }
        ArrayList<String> list3= new ArrayList<String>(list1);
        Iterator<String> it1 = list1.iterator();
        Iterator<String> it3 = list3.iterator();

        while (it1.hasNext()){
            System.out.print(it1.next()+" ");
        }
        System.out.println();
        while (it3.hasNext()){
            System.out.print(it3.next()+" ");
        }
    }
}

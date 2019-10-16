package codinginterviews;

import java.util.HashMap;

public class Question35 {

    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead ==null)
            return null;
        RandomListNode result = new RandomListNode(pHead.label);
        RandomListNode temp = pHead;
        RandomListNode rtemp = result;
        HashMap<RandomListNode,RandomListNode> nMap = new HashMap<RandomListNode,RandomListNode>();
        nMap.put(pHead,result);
        while (temp.next != null){
            temp = temp.next;
            rtemp.next = new RandomListNode(temp.label);
            rtemp = rtemp.next;
            nMap.put(temp,rtemp);
        }
        result.random = nMap.get(pHead.random);
        temp = pHead;
        rtemp = result;
        while (temp.next != null){
            temp = temp.next;
            rtemp = rtemp.next;
            if(temp.random !=null){
                rtemp.random = nMap.get(temp.random);
            }
        }
        return result;
    }

    public RandomListNode Clone1(RandomListNode pHead)
    {
        if(pHead ==null)
            return null;
        RandomListNode pHeadtemp = pHead;
        while (pHeadtemp != null){
            RandomListNode copyNode = new RandomListNode(pHeadtemp.label);
            copyNode.next = pHeadtemp.next;
            pHeadtemp.next = copyNode;
            pHeadtemp = copyNode.next;
        }
        pHeadtemp = pHead;
        while (pHeadtemp != null){
            if(pHeadtemp.random !=null)
            pHeadtemp.next.random = pHeadtemp.random.next;
            pHeadtemp = pHeadtemp.next.next;
        }
        pHeadtemp = pHead;
        RandomListNode pCopy = pHead.next;
        RandomListNode copyTemp =pCopy;
        while(copyTemp.next != null){
            pHeadtemp.next = copyTemp.next;
            pHeadtemp = pHeadtemp.next;
            copyTemp.next = pHeadtemp.next;
            copyTemp =copyTemp.next;
        }
        return pCopy;
    }
    class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }
}



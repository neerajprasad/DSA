package interview.map;

import interview.linkList.LinkedList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MergeKSortedLists {
    public static void main(String[] args) {
        int N = 4;
        int[] val = {1, 10, 11, 12};
        LinkedList linkedList = new LinkedList();
        for (int i : val) {
            linkedList.insertNode(i);
        }
        int[] val1 = {133, 233, 333, 33, 533};
        LinkedList linkedList1 = new LinkedList();
        for (int i : val1) {
            linkedList1.insertNode(i);
        }

        ArrayList<LinkedList> lists = new ArrayList<LinkedList>();
        lists.add(linkedList);
        lists.add(linkedList1);
        LinkedList[] l = lists.toArray(new LinkedList[0]);

        LinkedList result = mergeKLists(l);
        result.printList();

    }

    private static LinkedList mergeKLists(List<LinkedList> lists) {
        if(lists==null||lists.size()==0)
            return null;
        PriorityQueue<LinkedList> queue = new PriorityQueue<LinkedList>(new Comparator<LinkedList>() {
            @Override
            public int compare(LinkedList o1, LinkedList o2) {
                return o1.val - o2.val;
            }
        });
        LinkedList head = new LinkedList(0);
        LinkedList cur = head;
        for (LinkedList list : lists) {
            if (list != null) {
                queue.offer(list);
            }
        }
        while (!queue.isEmpty()) {
            LinkedList temp = queue.poll();
            cur.next = temp;
            cur = cur.next;
            if (temp.next != null) {
                queue.offer(temp.next);
            }
        }
        return head.next;
    }

    public static  LinkedList mergeKLists(LinkedList[] lists) {
        if(lists==null||lists.length==0)
            return null;
        PriorityQueue<LinkedList> queue = new PriorityQueue<LinkedList>(new Comparator<LinkedList>(){
            public int compare(LinkedList l1, LinkedList l2){
                return l1.val - l2.val;
            }
        });
        LinkedList head = new LinkedList(0);
        LinkedList p = head;
        for(LinkedList list: lists){
            if(list!=null)
                queue.offer(list);
        }
        while(!queue.isEmpty()){
            LinkedList n = queue.poll();
            p.next = n;
            p=p.next;
            if(n.next!=null)
                queue.offer(n.next);
        }
        return head.next;
    }

}

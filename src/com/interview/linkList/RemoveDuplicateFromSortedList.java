package interview.linkList;

public class RemoveDuplicateFromSortedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        int[] val ={0,0,0,0,1,1,2,2,2,3,3,3,3,3,4};

        for(int i:val){
            linkedList.insertNode(i);
        }
        System.out.println("before removing");
        linkedList.printList();

        removeDuplicate(linkedList);
        System.out.println("after removing");
        linkedList.printList();
    }

    private static void removeDuplicate(LinkedList linkedList) {
        LinkedList prev=null;
        LinkedList cur=linkedList.head;

        while(cur!=null){
            prev=cur;
            cur=cur.next;
            while(cur!=null && prev.val==cur.val){
                prev.next=cur.next;
                cur=prev.next;
            }
        }
    }

}

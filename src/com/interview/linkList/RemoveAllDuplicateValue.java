package interview.linkList;

public class RemoveAllDuplicateValue {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        int[] val = {1,10,10,10,10,11,12,33,33,33,33,33};

        for (int i : val) {
            linkedList.insertNode(i);
        }
        System.out.println("before removing");
        linkedList.printList();
        linkedList = removeDuplicate(linkedList);
        System.out.println("before removing");
        linkedList.printList(linkedList);
    }

    private static LinkedList removeDuplicate(LinkedList linkedList) {
        LinkedList prev = null;
        LinkedList cur = linkedList.head;
        LinkedList newHead = null;
        boolean repeated = false;

        while (cur != null) {
            prev = cur;
            cur = cur.next;
            if (cur != null && prev.val == cur.val) {
                while (cur != null && prev.val == cur.val) {
                    prev = cur;
                    cur = cur.next;
                }
                repeated = true;
            }
            if (!repeated) {
                LinkedList temp = new LinkedList(prev.val);
                if (newHead == null) {
                    newHead = temp;
                } else {
                    LinkedList loopNode = newHead;
                    while (loopNode.next != null) {
                        loopNode = loopNode.next;
                    }
                    loopNode.next = temp;
                }

            }
            repeated = false;
        }
        return newHead;
    }

}

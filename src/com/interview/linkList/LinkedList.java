package interview.linkList;

public class LinkedList {
    public LinkedList head = null;
     public int val;
     public LinkedList next;
    public LinkedList(){

    }
    public LinkedList(int val) {
        this.val = val;
        this.next = null;
    }

    public void insertNode(int val) {
        LinkedList cur = new LinkedList(val);
        if (head == null) {
            head = cur;
        } else {
            LinkedList loopNode = head;
            while (loopNode.next != null) {
                loopNode = loopNode.next;
            }
            loopNode.next = cur;
        }

    }

    public void printList() {
        LinkedList cur = head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;

        }
    }
    public void printList(LinkedList head) {
        LinkedList cur = head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;

        }
    }
}

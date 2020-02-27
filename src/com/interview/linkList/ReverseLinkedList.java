package interview.linkList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        int[] val = {1, 10, 11, 12, 133, 233, 333, 33, 533};

        for (int i : val) {
            linkedList.insertNode(i);
        }
        linkedList = reverseBetween(linkedList.head, 4, 7);
        linkedList.printList(linkedList);
    }

    private static LinkedList reverseList(LinkedList A, int start, int end) {
        LinkedList prev = null;
        LinkedList current = A;
        LinkedList next;
        int count = 0;
        while (current != null) {
            if (count >= start && count <= end) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            } else {
                prev = current;
                current = current.next;
            }
            count++;
        }
        A.printList();
        return A;

    }

    public static LinkedList reverseBetween(LinkedList head, int m, int n) {
        if (m == n)
            return head;
        int count = 1;
        LinkedList curr = head;
        LinkedList revPrev = null;
        while (count < m) {
            revPrev = curr;
            curr = curr.next;
            count = count + 1;
        }
        LinkedList revStart = curr;
        while (count < n) {
            curr = curr.next;
            count = count + 1;
        }
        LinkedList revEnd = curr;
        LinkedList revNext = curr.next;
        curr.next = null;
        LinkedList revPart = reverse(revStart);
        if (revPrev != null) {
            revPrev.next.next = revNext;
            revPrev.next = revPart;
        } else {
            if (revNext != null) {
                head.next = revNext;
            }
            head = revPart;
        }

        return head;
    }

    static LinkedList reverse(LinkedList secondHalf) {
        LinkedList prev = null;
        LinkedList current = secondHalf;
        LinkedList next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        secondHalf = prev;
        return secondHalf;

    }
}

 

    


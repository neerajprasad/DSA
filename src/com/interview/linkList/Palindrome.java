package interview.linkList;

public class Palindrome {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        int[] val ={1};

        for(int i:val){
            linkedList.insertNode(i);
        }
//        linkedList.printList();
        System.out.println(palindromeUtil(linkedList.head));

//        linkedList.printList();
    }

    private static int palindromeUtil(LinkedList head) {
        boolean result=false;
        LinkedList fast=head;
        LinkedList slow=head;
        LinkedList prevSlow=head;
        LinkedList middleNode=null;
        LinkedList secondHalf;

        if(head!=null && head.next!=null){

            while(fast!=null && fast.next!=null){
                fast=fast.next.next;
                prevSlow=slow;
                slow=slow.next;
            }
            if(fast!=null){
                middleNode=slow;
                slow=slow.next;
            }
            secondHalf=slow;
            prevSlow.next=null;
            secondHalf=reverseList(secondHalf);
            return compareList(head,secondHalf);
//            secondHalf=reverseList(secondHalf);
//            if(middleNode!=null){
//                prevSlow.next=middleNode;
//                middleNode.next=secondHalf;
//            }else {
//                prevSlow.next=secondHalf;
//            }
        }
return 1;
    }

    private static int compareList(LinkedList head, LinkedList secondHalf) {
        LinkedList first=head;
        LinkedList second = secondHalf;
        while(first!=null && second!=null){
            if(first.val==second.val){
                first = first.next;
                second=second.next;
            }
            else{
                return  0;
            }
        }
        if(first==null && second ==null){
            return 1;
        }
        return 0;
    }

    private static LinkedList reverseList(LinkedList secondHalf) {
        LinkedList prev=null;
        LinkedList current = secondHalf;
        LinkedList next;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        secondHalf=prev;
        return secondHalf;

    }
}
// 1 2 3 4 5 6
// 1: f3,s2
// 2:f5,s3
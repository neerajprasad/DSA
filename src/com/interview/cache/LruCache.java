package interview.cache;

import java.util.HashMap;
import java.util.Map;

public class LruCache {

    private int capacity;
    private int key;
    private Map<Integer,Node> cache;
    private Node head;
    private Node tail;

    public LruCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>();
    }
//    put
//    get
//    moveToFirst
//    deleteNode
//

    public void put(int key,int value){
        if(cache.containsKey(key)){
            Node current= cache.get(key);
            current.value=value;
            moveToFront(current);
            return;
        }
        Node current =  new Node(key, value);
        if(cache.size()==capacity){
            cache.remove(tail.key);
            removeNode(tail);

        }
        cache.put(key,current);
        moveToFirst(current);

    }

    public int get(int key){
        if(cache.containsKey(key)){
            Node current =cache.get(key);
            moveToFront(current);
            return current.value;
        }
        return -1;
    }

    private void moveToFront(Node current) {
        removeNode(current);
        moveToFirst(current);
    }

    private void moveToFirst(Node current) {
        current.right=head;
        current.left=null;
        if(head!=null){
            head.left=current;
        }
        head=current;
        if(tail==null){
            tail=current;
        }


    }

    private void removeNode(Node current) {
        Node prev= current.left;
        Node next = current.right;
        if(prev!=null){
            prev.right=next;
        }else {
            head=next;
        }

        if(next!=null){
            next.left=prev;
        }else{
            tail=prev;
        }
    }

    public int getCapacity() {
        return capacity;
    }

}

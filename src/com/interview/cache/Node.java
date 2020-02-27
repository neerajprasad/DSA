package interview.cache;

public class Node {
    public int key;
    public int value;
    public Node left=null;
    public Node right=null;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

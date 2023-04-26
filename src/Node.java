public class Node {
    Object data;
    Node next;
    Node prev;

    public Node(Object data){
        this.prev = null;
        this.data = data;
        this.next = null;
    }

    public Node(Node prev, Object data, Node next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
    public Node(Node prev, Object data){
        this.prev = prev;
        this.data = data;
        this.next = null;
    }


}

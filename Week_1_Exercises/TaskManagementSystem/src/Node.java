public class Node {
    private Task data;
    private Node next;

    Node(Task data){
        setData(data);
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Task getData() {
        return data;
    }

    public void setData(Task data) {
        this.data = data;
    }
}

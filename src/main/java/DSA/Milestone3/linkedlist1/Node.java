package DSA.Milestone3.linkedlist1;

public class Node<T> {
    T data;
    public Node<T> next;

    public Node(T data) {
        this.data = data;
        next = null;
    }
}

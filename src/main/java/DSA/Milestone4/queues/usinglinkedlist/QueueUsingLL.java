package DSA.Milestone4.queues.usinglinkedlist;

import DSA.Milestone3.linkedlist1.Node;

public class QueueUsingLL<T> {
    private Node<T> front;
    private Node<T> rear;

    private int size;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(T elem) {
        Node<T> newNode = new Node<>(elem);
        size++;
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

//    public T peek() {
//
//    }

//    public T dequque() {
//
//    }

}

package DSA.Milestone3.linkedlist1;

import org.w3c.dom.ls.LSOutput;

public class LinkedListImpl {
    public static Node<Integer> createLinkedList(){
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        n1.next = n2;
        Node<Integer> n3 = new Node<>(30);
        n2.next = n3;
        Node<Integer> n4 = new Node<>(40);
        n3.next = n4;

        return n1;

    }
    public static void main(String[] args) {
        Node <Integer> n1 = new Node(5);
        System.out.println(n1.data);
        System.out.println(n1.next);

        System.out.println();
        System.out.println(createLinkedList().data);
        System.out.println(createLinkedList().next);
    }
}

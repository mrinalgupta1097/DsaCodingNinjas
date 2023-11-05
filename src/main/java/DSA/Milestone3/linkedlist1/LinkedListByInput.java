package DSA.Milestone3.linkedlist1;

import java.util.Scanner;

public class LinkedListByInput {
    public static Node<Integer> takeInput() {
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        Node<Integer> head = null;
        while (data != -1) {
            Node<Integer> currentNode = new Node<>(data);
            if (head == null) {
                /*
                 * it is the first element
                 * so current node will be head opf linked list*/
                head = currentNode;
            } else {
                /*
                 * now, for all other elements input
                 * they will be added at the end and previous node will point to this
                 * we have to traverse the list from head till the last element(tail)
                 * as we reach the last element we have to connect it to new input*/
                Node<Integer> tail = head;
                while (tail.next != null) {
                    tail = tail.next;
                }
                tail.next = currentNode;
            }
            data = s.nextInt();
        }
        return head;
    }
    /*
    * Take input optimized
    */
    public static Node<Integer> takeInput_Optimized() {
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        Node<Integer> head = null, tail = null;
        while (data != -1) {
            Node<Integer> currentNode = new Node<>(data);
            if (head == null) {
                /*
                 * it is the first element
                 * so current node will be head and tail of linked list*/
                head = currentNode;
                tail = currentNode;
            } else {
                /*
                * when head is there and an element is added
                * tail( currently same as head) will point to new node created (that is current node)*/
                tail.next = currentNode;
                // and also tail will be shifted to next node
                tail = currentNode;
            }
            data = s.nextInt();
        }
        return head;
    }

    public static void main(String[] args) {
//        Node<Integer> head = takeInput();
//        System.out.println(head.data);
        Node<Integer> head1 = takeInput_Optimized();
        System.out.println(head1.data);
    }
}

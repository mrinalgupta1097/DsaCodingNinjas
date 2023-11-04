package DSA.Milestone3.linkedlist1;

public class LinkedListImpl {
    public static Node<Integer> createLinkedList() {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        n1.next = n2;
//        System.out.println("n1: " + n1 + " data: " + n1.data + " next: " + n1.next);
//        System.out.println();
        Node<Integer> n3 = new Node<>(30);
        n2.next = n3;
//        System.out.println("n2: " + n2 + " data: " + n2.data + " next: " + n2.next);
//        System.out.println();
        Node<Integer> n4 = new Node<>(40);
        n3.next = n4;
//        System.out.println("n3: " + n3 + " data: " + n3.data + " next: " + n3.next);
//        System.out.println();
//        System.out.println("n4: " + n4 + " data: " + n4.data + " next: " + n4.next);


        return n1;

    }

    // print linked list
    public static void print(Node<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
    }

    /*
     * function to increment every element in linked list from given head
     */
    public void increment(Node<Integer> head) {
        while (head != null) {
            head.data++;
            head = head.next;
        }
    }

    /*
     * function to calculate length of linked list from the given head*/
    public static int length(Node<Integer> head) {
        //Your code goes here
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }

    public static void main(String[] args) {
        Node<Integer> n1 = new Node(5);
//        System.out.println(n1.data);
//        System.out.println(n1.next);

        print(createLinkedList());

        System.out.println();
        System.out.println(createLinkedList());
//        System.out.println(createLinkedList().next);
    }
}

package DSA.Milestone3.linkedlist1;

public class DeleteNodeFromLinkedList {
    public static Node<Integer> deleteNode( Node<Integer> head, int pos) {
        //empty linked list
        if(head == null || pos < 0){
            return head;
        }
        if(pos == 0){
            head = head.next;
            return head;
        }
        Node<Integer> current = head;
        int currentPosition = 0;
        while(current != null && currentPosition < pos -1){
            current = current.next;
            currentPosition++;
        }
        if(current == null || current.next == null){
            return head;
        }
        current.next = current.next.next;
        return head;


    }
}

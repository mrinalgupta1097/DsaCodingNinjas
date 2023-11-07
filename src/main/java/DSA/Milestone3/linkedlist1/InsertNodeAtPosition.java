package DSA.Milestone3.linkedlist1;

public class InsertNodeAtPosition {

    public static Node<Integer> insert(Node<Integer> head, int pos, int data) {
        int length = 0;
        while(head != null){
            length++;
            head= head.next;
        }
        if(pos > length){
            return head;
        }
        ///create a new node to be inserted
        Node<Integer> newNode = new Node<>(data);
        //handle zero position case
        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            return head;
        } else {
            int index = 0;
            Node<Integer> previous = head;
            //traverse to node previous than position
            while (index < (pos - 1) && previous.next != null) {
                previous = previous.next;
                index++;
            }
            if (previous != null) {
                //now, the new node will point to next node not the previous node(head in our case)
                newNode.next = previous.next;
                //previous node will point to newNode
                previous.next = newNode;
            }
        }
        return newNode;
    }

}

package DSA.Milestone3.linkedlist1;

public class AppendLastNodesToFront {
    public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
        Node<Integer> node = head, checkNode = null, newHead = null;
        if (n == 0) {
            return head; // No changes needed for empty list or.
        }

        //find length of linked list
        int length = LengthOfLinkedList.findLengthOfLL(head);
        if (n > length) {
            return head;// No changes needed for n >= length.
        }
        n = length - n;  //remaining elements, suppose length = 5, elements to append 2, n = 3;
        //reach to the n
        node = head; // first reset node to head as it was on last node
        for(int i = 0; i < n-1; i++){
            node = node.next;
        }
        // now node is at n (length - elements to be appended)
        checkNode = node.next;
        //checkNode.next will be the new head after appending
        newHead = checkNode;
        //now join the last of original linked list to head of original linked list so that new node can be linked
        while( checkNode.next != null){
            checkNode = checkNode.next;
        }
        checkNode.next = head; // first make then break
        head = newHead;
        return head;
    }
}

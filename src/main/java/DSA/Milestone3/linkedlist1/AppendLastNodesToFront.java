package DSA.Milestone3.linkedlist1;

public class AppendLastNodesToFront {
    public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
        if (head == null || n <= 0) {
            return head; // No changes needed for empty list or n <= 0.
        }
        //find length of linked list
        int length = 0;
        Node<Integer> currentElement = head;
        while (currentElement.next != null) {
            currentElement = currentElement.next;
            length++;
        }
        if (n >= length) {
            return head;// No changes needed for n >= length.
        }
        int positionToBreak = length - n;
        currentElement = head;
        Node<Integer> previousElement = null;
        // Move currentElement to the node just before the n-th node from the end.
        for (int i = 1; i < positionToBreak; i++) {
            previousElement = currentElement;
            currentElement = currentElement.next;
        }

        Node<Integer> newHead = currentElement;
        if(previousElement != null){
            previousElement.next = null;
        }

        // Find the last node in the original list and connect it to the old head.
        Node<Integer> lastNode = newHead;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = head;

        return newHead;
    }
}

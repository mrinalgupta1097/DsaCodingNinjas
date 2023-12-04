package DSA.Milestone3.linkedlist1;

import java.util.Objects;

public class LengthOfLinkedList {
    public static int findLengthOfLL(Node<Integer> head) {
        if (Objects.isNull(head)) {
            return 0;
        }
        int length = 0;
        while (head != null) {
            head = head.next;
            length++;
        }
        return length;
    }
}

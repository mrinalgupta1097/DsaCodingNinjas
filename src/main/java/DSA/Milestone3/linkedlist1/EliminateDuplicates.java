package DSA.Milestone3.linkedlist1;

import java.io.ObjectStreamException;
import java.util.Objects;

public class EliminateDuplicates {
    public static Node<Integer> removeDuplicates(Node<Integer> head) {
        if (Objects.isNull(head) || Objects.isNull(head.next)) {
            return head;
        }
        Node<Integer> uniqueElement = head.next;
        Node<Integer> node = head;
        while (Objects.nonNull(uniqueElement)) {
            if (!Objects.equals(uniqueElement.data, node.data)) {
                node.next = uniqueElement;
                node = node.next;
            }
            uniqueElement = uniqueElement.next;
        }
        node.next = uniqueElement;
        return head;
    }
}

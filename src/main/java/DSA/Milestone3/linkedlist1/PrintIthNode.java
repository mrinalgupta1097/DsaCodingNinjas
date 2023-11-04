package DSA.Milestone3.linkedlist1;

public class PrintIthNode {
    public static void printIthNode(Node<Integer> head, int i){
        int length = -1;
        while(head != null){
            length++;
            if(length == i){
                System.out.println(head.data);
            }
            head = head.next;
        }

    }
}

package DSA.Milestone3.linkedlist1;

public class FindNodeInLinkedList {
    /*
    return index else return -1
     */
    public static int findNode(Node<Integer> head, int n) {
        // Write your code here.
        int position = 0;
        while(head != null){
            if(head.data == n){
                return position;
            }
            head = head.next;
            position++;
        }
        return -1;
    }
}

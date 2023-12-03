package DSA.Milestone3.linkedlist1;

public class InsertNodeAtPosition {

    public static Node<Integer> insert(Node<Integer> head, int pos, int data) {
        if (pos==0)
        {
            Node<Integer> newNode=new Node<>(data);
            newNode.next=head;
            head=newNode;
        }
        else
        {
            int i=0;
            Node<Integer> n=head;
            for (i=0;i<pos-1 && n!=null;i++)
            {
                //System.out.println("At node: "+i);
                n=n.next;
            }
            //System.out.println("At node: "+i);
            if (n!=null && pos>0)
            {
                Node<Integer> newNode=new Node<>(data);
                newNode.next=n.next;
                n.next=newNode;
            }
        }

        return head;
    }

}

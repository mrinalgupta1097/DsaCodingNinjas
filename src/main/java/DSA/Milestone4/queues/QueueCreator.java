package DSA.Milestone4.queues;

public class QueueCreator {
    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray(5);
        int[] arr = {10,20,30,40};
        for(int element : arr){
            try {
                queue.enqueue(element);
            } catch (QueueFullException e) {
                throw new RuntimeException(e);
            }
        }

        //remove elements from queue
        while (!queue.isEmpty()){
            try {
                System.out.println(queue.dequeue());
            } catch (QueueEmptyException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

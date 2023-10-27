package DSA.Milestone4.queues;

public class QueueUsingArray {
    private int[] data;
    private int front; // index of element at front of the queue
    private int rear;// index of the element at the rear of the queue

    private int size;

    public QueueUsingArray() {
        data = new int[5];
        front = -1;
        rear = -1;
    }
    public QueueUsingArray(int capacity){
        data = new int[capacity];
        front = -1;
        rear = -1;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int element) throws QueueFullException {
        if(size == data.length){
            throw new QueueFullException();
        }
        if (size == 0) {
            front = 0;
        }
        rear++;
        data[rear] = element;
        size++;

    }

    public int front() throws QueueEmptyException {
        if (size == 0) {
            throw new QueueEmptyException();
        }
        return data[front];
    }

    public int dequeue() throws QueueEmptyException {
        if(size ==  0){
            throw new QueueEmptyException();

        }
        int temp = front;
        front++;
        size--;
        return temp;

    }

}

package DSA.Milestone4.queues;

public class CircularQueue {
    /*
     * then last element of the queue is connected to first element of the queue
     */

    private int[] data;
    private int front; // index of element at front of the queue
    private int rear;// index of the element at the rear of the queue

    private int size;

    public CircularQueue() {
        data = new int[5];
        front = -1;
        rear = -1;
    }

    public CircularQueue(int capacity) {
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
        if (size == data.length) {
            throw new QueueFullException();
        }
        if (size == 0) {
            front = 0;
        }
//        rear++;
//        //if this is last element
//        if(rear == data.length){
//            rear = 0;//connected rear to front
//        }
        rear = (rear + 1) % data.length;
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
        if (size == 0) {
            front = -1;
            rear = -1;
            throw new QueueEmptyException();

        }
        int temp = front;
        front++;
        front = (front + 1) % data.length;
        size--;
        return temp;

    }

}

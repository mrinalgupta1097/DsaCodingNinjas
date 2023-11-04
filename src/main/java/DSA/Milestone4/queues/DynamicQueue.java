package DSA.Milestone4.queues;

public class DynamicQueue {
    private int[] data;
    private int front; // index of element at front of the queue
    private int rear;// index of the element at the rear of the queue

    private int size;

    public DynamicQueue() {
        data = new int[5];
        front = -1;
        rear = -1;
    }
    public DynamicQueue(int capacity){
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

    public void enqueue(int element) {
        if(size == data.length){
//            throw new QueueFullException();
            doubleCapacity();
        }
        if (size == 0) {
            front = 0;
        }
        rear++;
        data[rear] = element;
        size++;

    }

    private void doubleCapacity() {
        int[] temp = data;
        data = new int[2 * temp.length];
        int index = 0;
        for(int i = front; i < temp.length; i++){//i = front to ensure FIFO
            data[index++] = temp[i];
        }
        front = 0;
        rear = temp.length -1;
    }

    public int front() throws QueueEmptyException {
        if (size == 0) {
            throw new QueueEmptyException();
        }
        return data[front];
    }

    public int dequeue() throws QueueEmptyException {
        if(size ==  0){
            front = -1;
            rear = -1;
            throw new QueueEmptyException();

        }
        int temp = data[front];
        front++;
        size--;
        return temp;

    }

}

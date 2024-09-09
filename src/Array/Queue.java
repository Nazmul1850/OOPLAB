package Array;

public class Queue {
    private int[] arrays;
    private int front;
    private int rear;
    private int maxSize;

    public Queue(int capacity) {
        this.maxSize = capacity;
        arrays = new int[capacity];
        front = 0;
        rear = 0;
    }
    public boolean isEmpty() {
        return front == rear;
    }
//    public boolean isFull() {
//        return rear == maxSize;
//    }
    public void enqueue(int item) {
        if(rear == maxSize - 1) {
            System.out.println("Queue is full");
        }else {
            arrays[rear] = item;
            rear++;
        }
    }
    public int dequeue() {
        if(front == rear) {
            System.out.println("Queue is empty");
            return -1;
        }else {
            int item = arrays[front++];
            return item;
        }
    }
    public int peek(){
        if(front == rear) {
            System.out.println("Queue is empty");
            return -1;
        }else{
            return arrays[front];
        }
    }
}

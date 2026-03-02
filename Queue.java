package queue;

public class Queue {
    private int[] data;
    private int front, rear, size;

    public Queue(int capacity) {
        data = new int[capacity];
        front = rear = size = 0;
    }

    public void enqueue(int value) {
        if (size == data.length)
            throw new RuntimeException("Queue Full");

        data[rear] = value;
        rear = (rear + 1) % data.length;
        size++;
    }

    public int dequeue() {
        if (size == 0)
            throw new RuntimeException("Queue Empty");

        int value = data[front];
        front = (front + 1) % data.length;
        size--;
        return value;
    }
}
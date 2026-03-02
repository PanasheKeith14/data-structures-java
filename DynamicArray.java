package arrays;

public class DynamicArray {
    private int[] data;
    private int size;

    public DynamicArray() {
        data = new int[2];
        size = 0;
    }

    public void add(int value) {
        if (size == data.length) {
            resize();
        }
        data[size++] = value;
    }

    public int get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        return data[index];
    }

    public void removeLast() {
        if (size > 0) size--;
    }

    private void resize() {
        int[] newData = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    public int size() {
        return size;
    }
}
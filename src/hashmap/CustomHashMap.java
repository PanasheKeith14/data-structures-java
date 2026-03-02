package hashmap;

import java.util.LinkedList;

public class CustomHashMap {
    private static class Entry {
        String key;
        int value;

        Entry(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Entry>[] table;
    private int capacity = 16;

    public CustomHashMap() {
        table = new LinkedList[capacity];
    }

    private int hash(String key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    public void put(String key, int value) {
        int index = hash(key);
        if (table[index] == null)
            table[index] = new LinkedList<>();

        for (Entry entry : table[index]) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }

        table[index].add(new Entry(key, value));
    }

    public Integer get(String key) {
        int index = hash(key);
        if (table[index] == null) return null;

        for (Entry entry : table[index]) {
            if (entry.key.equals(key))
                return entry.value;
        }
        return null;
    }
}
import arrays.DynamicArray;
import linkedlist.SinglyLinkedList;
import stack.Stack;
import queue.Queue;
import hashmap.CustomHashMap;
import tree.BinarySearchTree;
import graph.Graph;

public class Main {
    public static void main(String[] args) {

        DynamicArray arr = new DynamicArray();
        arr.add(10);
        arr.add(20);
        System.out.println("DynamicArray size: " + arr.size());

        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtHead(3);
        list.insertAtTail(5);
        list.printList();

        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        System.out.println("Stack pop: " + stack.pop());

        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        System.out.println("Queue dequeue: " + queue.dequeue());

        CustomHashMap map = new CustomHashMap();
        map.put("age", 22);
        System.out.println("HashMap get: " + map.get("age"));

        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(5);
        bst.insert(2);
        bst.insert(8);
        bst.inorder();

        Graph graph = new Graph();
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.bfs(1);
        graph.dfs(1);
    }
}
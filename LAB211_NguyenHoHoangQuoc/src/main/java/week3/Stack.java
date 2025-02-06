/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

/**
 *
 * @author ASUS PC
 */
public class Stack {

    class Node {

        int data;

        public Node(int x) {
            this.data = x;
        }
    }

    Node[] arrayNode;
    int capacity;
    int lastIndex;

    public Stack(int capacity) {
        this.arrayNode = new Node[capacity];
        this.lastIndex = -1;
        this.capacity = capacity;
    }

    public Stack() {
        this(5);
    }

    boolean isEmpty() {
        return lastIndex == -1;
    }

    boolean isFull() {
        return lastIndex == capacity - 1;
    }

    void increaseSize() {
        int newCapacity = capacity * 2;
        Node[] newArrayNode = new Node[newCapacity];
        System.arraycopy(arrayNode, 0, newArrayNode, 0, capacity);
        arrayNode = newArrayNode;
        capacity = newCapacity;
    }

    void push(int x) {
        if (isFull()) {
            increaseSize();
        }
        arrayNode[++lastIndex] = new Node(x);
    }

    Node pop̣() {
        return arrayNode[lastIndex--];
    }

    Node get() {
        if (isEmpty()) {
            System.out.println("the stack is empty");
            return null;
        } else {
            return arrayNode[lastIndex];
        }
    }

    void traverse() {
        if (isEmpty()) {
            System.out.println("the stack is empty");
        } else {
            for (int i = 0; i <= lastIndex; i++) {
                System.out.print(arrayNode[i].data + "   ");
            }
            System.out.println(" ");
        }

    }

}

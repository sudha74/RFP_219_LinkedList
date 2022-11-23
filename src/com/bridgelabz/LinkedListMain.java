package com.bridgelabz;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        Node<Integer> node = new Node<>(56);
        linkedList.head = node;
        Node<Integer> node1 = new Node<>(30);
        node.next = node1;
        Node<Integer> node2 = new Node<>(70);
        node1.next = node2;
        linkedList.display();
    }
}

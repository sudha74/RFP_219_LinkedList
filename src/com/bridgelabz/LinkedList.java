package com.bridgelabz;

public class LinkedList<T extends Comparable<T>> {
    Node<T> head;
    Node<T> tail;

    public void push(T data) {
        Node<T> node = new Node<>(data);
        sortedInsert(node);
    }

    public void sortedInsert(Node<T> node) {
        Node<T> temp = head;
        if (temp == null || temp.data.compareTo(node.data) >= 0) {
            node.next = head;
            head = node;
        } else {
            while (temp.next != null && temp.next.data.compareTo(node.data) < 0)
                temp = temp.next;

            node.next = temp.next;
            temp.next = node;
        }
    }

    public Node<T> search(T searchData) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data.equals(searchData))
                return temp;
            temp = temp.next;
        }
        return null;
    }

    public boolean insertAfter(T searchData, T insertData) {
        Node<T> newNode = new Node<>(insertData);
        Node<T> searchedNode = search(searchData);
        if (searchedNode != null) {
            newNode.next = searchedNode.next;
            searchedNode.next = newNode;
            return true;
        }
        return false;
    }

    public void popElement(T value) {
        Node<T> searchedNode = search(value);
        Node<T> temp = head;
        while (temp.next != searchedNode) {
            temp = temp.next;
        }
        temp.next = searchedNode.next;

    }

    public void add(T data) {
        Node<T> node = new Node<>(data);
        sortedInsert(node);
    }

    public void display() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void insert(T data) {
        Node<T> node = new Node<>(data);
        head.next = node;
        node.next = tail;
    }

    public T pop() {
        T deletedElement = head.data;
        head = head.next;
        return deletedElement;
    }

    public int size() {
        int count = 0;
        Node<T> temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    public T popLast() {
        T deletedElement = tail.data;
        Node<T> temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        temp = tail;
        return deletedElement;
    }
}

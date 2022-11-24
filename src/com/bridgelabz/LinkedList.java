package com.bridgelabz;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;

    void push(T data){
        Node<T>node=new Node<>(data);
        if (head==null){
            head=node;
            tail=node;
        }else {
            node.next=head;
            head=node;
        }
    }

    void add(T data){
        Node<T>node=new Node<>(data);
        if (head==null){
            head=node;
            tail=node;
        }else {
            tail.next=node;
            tail=node;
        }
    }

    void insert(T data){
        Node<T>node=new Node<>(data);
        head.next=node;
        node.next=tail;
    }

    public T pop() {
        T deletedElement = head.data;
        head = head.next;
        return deletedElement;
    }

    public T popLast(){
        T deleteElement=tail.data;
        Node<T>temp=head;
        while (temp.next!=tail){
            temp=temp.next;
        }
        temp.next=null;
        temp=tail;
        return deleteElement;
    }

    public Node<T>search(T searchData){
        Node<T>temp=head;
        while (temp!=null){
            if (temp.data.equals(searchData))
                return temp;
            temp=temp.next;
        }
        return null;
    }

    void display() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
}

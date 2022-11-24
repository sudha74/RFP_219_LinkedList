package com.bridgelabz;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.push(70);
        linkedList.push(56);

        linkedList.insert(30);

        System.out.println(linkedList.popLast());

        linkedList.display();
        System.out.println();

        if (linkedList.search(30) != null) {
            System.out.println("Data found");
        } else {
            System.out.println("Data not found");
        }
        System.out.println(linkedList.insertAfter(30, 40));
        System.out.println();
    }
}
package com.bridgelabz.unorderedlinkedlist;

import java.io.FileWriter;
import java.io.IOException;
public class LinkedList<T> {

    Node<T> head;
    Node<T> tail;
    public void append(String string) {
        Node newNode = new Node(string);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public Node<T> search(T searchData) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data.equals(searchData)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public boolean insertAfter(T searchData, T insertData) {
        Node<T> insertNode = new Node<>(insertData);
        Node<T> searchedNode = search(searchData);
        if (searchedNode != null) {
            Node<T> temp = searchedNode.next;
            searchedNode.next = insertNode;
            insertNode.next = temp;
            return true;
        }
        return false;
    }

    public void writeToFile() {
        try {
            FileWriter fileWriter = new FileWriter("/Users/admin/Documents/Java Fellowship Program/Day16/src/com/bridgelabz/unorderedlinkedlist/text1.txt");
            Node<T> temp = head;
            while (temp != null) {
                String string = temp.data.toString();
                temp = temp.next;
                fileWriter.write(string+" ");
            }
            System.out.println();
            fileWriter.close();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}

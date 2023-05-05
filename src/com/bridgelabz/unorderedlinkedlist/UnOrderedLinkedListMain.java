package com.bridgelabz.unorderedlinkedlist;

import java.io.File;
import java.util.Scanner;

public class UnOrderedLinkedListMain {
    public static void main(String[] args) throws Exception{

        LinkedList linkedList = new LinkedList();
        File file = new File("/Users/admin/Documents/Java Fellowship Program/Day16/src/com/bridgelabz/unorderedlinkedlist/text.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            linkedList.append(scanner.next());
        }
        linkedList.display();

        boolean isInserted = linkedList.insertAfter("Java", "Python");
        if (isInserted) {
            System.out.println("Inserted successfully!");
        } else {
            System.out.println("Not inserted!");
        }
        linkedList.display();
        linkedList.writeToFile();
    }
}

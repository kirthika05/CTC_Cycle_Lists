package com.kirthika;

public class Main {

    /*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as:
    class Node {
        int data;
        Node next;
    }
*/

    boolean hasCycle(Node head) {
        Set<Node> visited = new HashSet<>();
        while (head != null) {
            visited.add(head);
            head = head.next;
            if (visited.contains(head)) return true;
        }
        return false;
    }
    
}

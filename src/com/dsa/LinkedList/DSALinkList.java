package com.dsa.LinkedList;

public class DSALinkList {
    Node head;
    public void append(int val){
        if (head == null){
            head = new Node(val);
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = new Node(val);
    }

    public void prepend(int val){
        Node newHead = new Node(val);
        newHead.next = head;
        head = newHead;
    }

    public void deleteWithValue(int val){
        if (head == null) return;
        if (head.data == val){
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null){
            if (current.next.data == val){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
}

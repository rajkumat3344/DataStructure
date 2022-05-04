package com.dsa.Queue;

public class DSAQueue {
    Node head; //Remove from the head
    Node tail; //Add things here

    public boolean isEmpty(){
        return head == null;
    }

    public void peek(){
        System.out.println(head.data);
    }

    public void add(int val){
        Node node = new Node(val);
        if (tail != null){
            tail.next = node;
        }
        tail = node;

        if (head == null){
            head = node;
        }
    }

    public int remove(){
        int val = head.data;
        head = head.next;
        if (head == null){
            tail = null;
        }
        return val;
    }
}
